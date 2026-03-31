import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Define the interface
interface Greeting {
    void sayHello(String name);
    void sayGoodbye(String name);
}

// Implement the interface
class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    @Override
    public void sayGoodbye(String name) {
        System.out.println("Goodbye, " + name + "!");
    }
}

public class LoggingProxy {

    public static void main(String[] args) {
        // Original object
        Greeting original = new GreetingImpl();

        // Create a dynamic proxy
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // Logging before method execution
                        System.out.println("Method called: " + method.getName());
                        if (args != null) {
                            System.out.print("Arguments: ");
                            for (Object arg : args) {
                                System.out.print(arg + " ");
                            }
                            System.out.println();
                        }
                        // Call the actual method
                        return method.invoke(original, args);
                    }
                }
        );

        // Use the proxy
        proxyInstance.sayHello("Alice");
        proxyInstance.sayGoodbye("Bob");
    }
}