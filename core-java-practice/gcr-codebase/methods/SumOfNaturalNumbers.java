import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int sumUsingRecursion(int n) {
        if (n == 1) return 1;
        return n + sumUsingRecursion(n - 1);
    }
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumRecursion == sumFormula) {
            System.out.println("Result is correct. Both computations match.");
        } else {
            System.out.println("Result is incorrect. Values do not match.");
        }
        sc.close();
    }
}
