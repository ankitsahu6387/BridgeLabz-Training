import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            MathOperations math = new MathOperations();

            System.out.print("Enter method to call (add, subtract, multiply): ");
            String methodName = sc.nextLine();

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Get the Method object dynamically
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            Object result = method.invoke(math, num1, num2);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}