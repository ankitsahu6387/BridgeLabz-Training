import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value(); // role required
}

// Service class with restricted methods
class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    @RoleAllowed("ADMIN")
    public void viewReports() {
        System.out.println("Accessing sensitive reports...");
    }

    public void generalTask() {
        System.out.println("Performing general task...");
    }
}

// Simulate user roles and validate access
public class RoleBasedAccess {

    public static void main(String[] args) throws Exception {

        String currentUserRole = "USER"; // simulate current logged-in role
        AdminService service = new AdminService();

        Method[] methods = AdminService.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (roleAllowed.value().equals(currentUserRole)) {
                    method.invoke(service);
                } else {
                    System.out.println("Access Denied to method: " + method.getName());
                }
            } else {
                // Methods without RoleAllowed are accessible to all
                method.invoke(service);
            }
        }
    }
}