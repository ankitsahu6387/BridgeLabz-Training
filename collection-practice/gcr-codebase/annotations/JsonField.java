import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name(); // JSON key name
}

// User class with annotated fields
class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    private int age; // not annotated, won't appear in JSON

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

// Serializer class
class JsonSerializer {

    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                try {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String key = annotation.name();
                    Object value = field.get(obj);

                    if (!firstField) {
                        json.append(", ");
                    }
                    json.append("\"").append(key).append("\": ");
                    json.append("\"").append(value).append("\"");

                    firstField = false;

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}

// Test the serialization
public class JsonField {
    public static void main(String[] args) {
        User user = new User("Ankit", "ankit@example.com", 25);
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}