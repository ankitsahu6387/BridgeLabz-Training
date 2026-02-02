import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

// Interface with computationally expensive method
interface Calculator {
    @CacheResult
    int fibonacci(int n);
}

// Implementation
class CalculatorImpl implements Calculator {

    @Override
    public int fibonacci(int n) {
        // naive recursion (expensive)
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// Dynamic Proxy to handle caching
class CachingProxy implements InvocationHandler {

    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CachingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Only cache methods annotated with @CacheResult
        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = method.getName() + "#" + args[0];
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for: " + key);
                return cache.get(key);
            }
            Object result = method.invoke(target, args);
            cache.put(key, result);
            System.out.println("Computed and cached result for: " + key);
            return result;
        } else {
            return method.invoke(target, args);
        }
    }
}

// Test the caching system
public class CacheResult {
    public static void main(String[] args) {
        CalculatorImpl calcImpl = new CalculatorImpl();
        Calculator calcProxy = (Calculator) Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[]{Calculator.class},
                new CachingProxy(calcImpl)
        );

        System.out.println("Fibonacci 5: " + calcProxy.fibonacci(5));
        System.out.println("Fibonacci 5 again: " + calcProxy.fibonacci(5));
        System.out.println("Fibonacci 6: " + calcProxy.fibonacci(6));
    }
}