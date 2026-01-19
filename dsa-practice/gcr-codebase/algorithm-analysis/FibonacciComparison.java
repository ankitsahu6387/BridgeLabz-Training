public class FibonacciComparison {

    // Recursive approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative approach
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;

        long startTime = System.nanoTime();
        int recursiveResult = fibonacciRecursive(n);
        long recursiveTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        int iterativeResult = fibonacciIterative(n);
        long iterativeTime = System.nanoTime() - startTime;

        System.out.println("Fibonacci(" + n + ") Recursive Result: " + recursiveResult);
        System.out.println("Time Taken (Recursive): " + recursiveTime + " ns");

        System.out.println("Fibonacci(" + n + ") Iterative Result: " + iterativeResult);
        System.out.println("Time Taken (Iterative): " + iterativeTime + " ns");
    }
}
