import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

// Apply annotation to methods
class DemoService {

    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1000; i++) {
            // simulate fast task
        }
    }

    @LogExecutionTime
    public void slowTask() {
        try {
            Thread.sleep(500); // simulate slow task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Use Reflection to measure execution time
public class ExecutionTimeLogger {

    public static void main(String[] args) {
        DemoService service = new DemoService();

        Method[] methods = DemoService.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    long start = System.nanoTime();
                    method.invoke(service); // run the method
                    long end = System.nanoTime();
                    System.out.println("Method " + method.getName() +
                            " executed in " + (end - start) / 1_000_000 + " ms");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}