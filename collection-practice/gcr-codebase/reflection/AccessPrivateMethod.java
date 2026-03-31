import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class AccessPrivateMethod {

    public static void main(String[] args) {
        try {
            Calculator calc = new Calculator();

            // Access the private method "multiply"
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

            // Make it accessible
            multiplyMethod.setAccessible(true);

            // Invoke the method
            int result = (int) multiplyMethod.invoke(calc, 5, 6);

            System.out.println("Result of multiply: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}