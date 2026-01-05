class MathUtility {
    static long factorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    static int gcd(int a, int b) {
        if (a < 0) a = Math.abs(a);
        if (b < 0) b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println("Factorial(5): " + factorial(5));
        System.out.println("Factorial(0): " + factorial(0));
        System.out.println("Factorial(-3): " + factorial(-3));

        System.out.println("IsPrime(7): " + isPrime(7));
        System.out.println("IsPrime(1): " + isPrime(1));
        System.out.println("IsPrime(-5): " + isPrime(-5));

        System.out.println("GCD(24, 36): " + gcd(24, 36));
        System.out.println("GCD(-12, 18): " + gcd(-12, 18));

        System.out.println("Fibonacci(6): " + fibonacci(6));
        System.out.println("Fibonacci(0): " + fibonacci(0));
        System.out.println("Fibonacci(-4): " + fibonacci(-4));
    }
}
