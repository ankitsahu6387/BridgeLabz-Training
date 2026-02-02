import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    int priority();
    String assignedTo();
}

// Apply Annotation to a Method
class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Ankit")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

// Retrieve Annotation using Reflection
public class CustomAnnotation {

    public static void main(String[] args) {

        try {
            Method method = TaskManager.class.getMethod("completeTask");

            if (method.isAnnotationPresent(TaskInfo.class)) {

                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}