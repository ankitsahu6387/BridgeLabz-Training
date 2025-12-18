import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");    
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        int result = (int) Math.pow(base, exponent);      
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        sc.close();
    }
}
