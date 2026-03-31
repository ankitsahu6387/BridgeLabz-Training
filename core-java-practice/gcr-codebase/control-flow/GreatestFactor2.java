import java.util.Scanner;

public class GreatestFactor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int greatestFactor = 1;
        int i = 1;
        while(i <= n / 2) {
            if(n % i == 0) {
                greatestFactor = i;
            }
            i++;
        }   
        System.out.println("Greatest factor of " + n + " is: " + greatestFactor);
    }
}
