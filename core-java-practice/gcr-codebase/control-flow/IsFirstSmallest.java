import java.util.Scanner;

public class IsFirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        sc.close();
        if (num1 < num2 && num1 < num3) {
            System.out.println("First number " + num1 + " is the smallest number");
        } else {
            System.out.println("First Number " + num1 + " is not the smallest number");
        }
    }
}
