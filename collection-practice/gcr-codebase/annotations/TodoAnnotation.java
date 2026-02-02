import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();                 // description of task
    String assignedTo();            // developer name
    String priority() default "MEDIUM";
}

// Apply Annotation to Methods
class ProjectService {

    @Todo(
        task = "Implement user authentication",
        assignedTo = "Ankit",
        priority = "HIGH"
    )
    public void loginFeature() {
        // pending
    }

    @Todo(
        task = "Add email notifications",
        assignedTo = "Rahul"
    )
    public void notificationFeature() {
        // pending
    }

    public void completedFeature() {
        // no todo
    }
}

// Retrieve and Print Todos using Reflection
public class TodoAnnotation {

    public static void main(String[] args) {

        Method[] methods = ProjectService.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method Name : " + method.getName());
                System.out.println("Task        : " + todo.task());
                System.out.println("Assigned To : " + todo.assignedTo());
                System.out.println("Priority    : " + todo.priority());
                System.out.println("----------------------------------");
            }
        }
    }
}