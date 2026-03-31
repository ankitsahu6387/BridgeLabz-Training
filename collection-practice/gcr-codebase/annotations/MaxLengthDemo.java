import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

// Apply annotation to class fields
class User {
    
    @MaxLength(10) // max 10 characters allowed
    private String username;

    public User(String username) {
        this.username = username;
        validateFields(); // validate annotated fields
    }

    // Validate fields using Reflection
    private void validateFields() {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                field.setAccessible(true);
                try {
                    Object value = field.get(this);
                    if (value instanceof String) {
                        String str = (String) value;
                        if (str.length() > maxLength.value()) {
                            throw new IllegalArgumentException(
                                "Field '" + field.getName() + 
                                "' exceeds max length of " + maxLength.value()
                            );
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }
}

// Test the annotation
public class MaxLengthDemo {
    public static void main(String[] args) {
        try {
            User user1 = new User("ShortName"); // valid
            System.out.println("Username: " + user1.getUsername());

            User user2 = new User("ThisNameIsTooLong"); // invalid
            System.out.println("Username: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}