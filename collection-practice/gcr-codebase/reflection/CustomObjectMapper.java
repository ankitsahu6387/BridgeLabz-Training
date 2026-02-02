import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Sample class to map values into
class Person {
    private String name;
    private int age;
    private boolean active;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", active=" + active + "}";
    }
}

public class CustomObjectMapper {
    // Generic method to create object and set fields from map
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create new instance of the class
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                try {
                    Field field = clazz.getDeclaredField(entry.getKey());
                    field.setAccessible(true);
                    field.set(obj, entry.getValue());
                } catch (NoSuchFieldException e) {
                    // Field not found, skip
                }
            }
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("age", 28);
        data.put("active", true);
        Person person = toObject(Person.class, data);
        System.out.println(person);
    }
}