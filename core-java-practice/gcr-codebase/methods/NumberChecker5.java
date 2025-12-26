import java.util.Scanner;

public class NumberChecker5 {

    static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp != 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));

        sc.close();
    }
}
