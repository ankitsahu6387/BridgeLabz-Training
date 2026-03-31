import java.lang.reflect.Field;

class Person {
    private String name;
    private int age;
    private boolean active;

    public Person(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }
}
public class ObjectToJson {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            try {
                Field field = fields[i];
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(obj);
                json.append("\"").append(name).append("\":");
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 28, true);
        String jsonString = toJson(person);
        System.out.println(jsonString);
    }
}