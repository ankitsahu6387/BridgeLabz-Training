import java.lang.reflect.Method;

// Sample class whose methods we want to measure
class Task {
    public void fastTask() {
        for (int i = 0; i < 1_000_000; i++);
    }
    public void slowTask() {
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// Utility class to measure method execution time
class MethodTimer {
    public static void measureExecutionTime(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            try {
                long startTime = System.nanoTime();
                // Invoke method dynamically
                method.invoke(obj);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                System.out.println(
                    "Method: " + method.getName() +
                    " | Execution Time: " + duration + " ns"
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class MethodExecutionTiming {
    public static void main(String[] args) {
        Task task = new Task();
        // Measure execution time of all methods
        MethodTimer.measureExecutionTime(task);
    }
}