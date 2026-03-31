import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i=2; i<=n/2; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
}
