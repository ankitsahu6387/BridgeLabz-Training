import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        int[] nums = takeInput();
        int a = nums[0], b = nums[1];
        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        return new int[]{a, b};
    }

    static int calculateGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    static int calculateLCM(int x, int y, int gcd) {
        return (x * y) / gcd;
    }
}
