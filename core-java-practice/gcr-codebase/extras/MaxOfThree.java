import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int[] nums = takeInput();
        int max = findMaximum(nums[0], nums[1], nums[2]);
        System.out.println("Maximum number is: " + max);
    }
    static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        sc.close();
        return new int[]{a, b, c};
    }
    static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
