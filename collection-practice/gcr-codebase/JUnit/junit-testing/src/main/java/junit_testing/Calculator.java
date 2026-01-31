package junit_testing;

public class Calculator {

    // Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract b from a
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide a by b (throws exception if b = 0)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

