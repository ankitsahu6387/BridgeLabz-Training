import java.util.Scanner;

public class PowerOfNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        sc.close();
        long result = 1;
        int tempPower = power;
        while(tempPower > 0){
            result *= base;
            tempPower--;
        }
        System.out.println("Result: " + result);
    }
}
