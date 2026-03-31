import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int num = takeInput();
        long fact = factorial(num);
        displayResult(num, fact);
    }
    static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }
    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
    static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
