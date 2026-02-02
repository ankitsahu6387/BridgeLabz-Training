import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

// Custom Inject Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

// Dependency class
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

// Class that needs dependency injection
class Car {

    @Inject
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

// Simple DI Container
class DIContainer {

    public static <T> T createObject(Class<T> clazz) {
        try {
            // Create object instance
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Scan fields for @Inject
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {

                    // Create dependency object
                    Object dependency = field.getType()
                            .getDeclaredConstructor()
                            .newInstance();

                    // Inject dependency
                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

// Test the DI Container
public class DependencyInjectionExample {

    public static void main(String[] args) {

        Car car = DIContainer.createObject(Car.class);
        car.drive();
    }
}