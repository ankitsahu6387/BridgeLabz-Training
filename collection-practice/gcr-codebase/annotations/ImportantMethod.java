import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH"; // optional parameter
}

// Apply Annotation to Methods
class Service {

    @ImportantMethod
    public void processData() {
        System.out.println("Processing data...");
    }

    @ImportantMethod(level = "LOW")
    public void cleanup() {
        System.out.println("Cleaning up resources...");
    }

    public void helperMethod() {
        System.out.println("Helper method");
    }
}

// Retrieve Annotated Methods using Reflection
public class ImportantMethodExample {

    public static void main(String[] args) {

        Method[] methods = Service.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);

                System.out.println(
                        "Method: " + method.getName() +
                        " | Level: " + annotation.level()
                );
            }
        }
    }
}