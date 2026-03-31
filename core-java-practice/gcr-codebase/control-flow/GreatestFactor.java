import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int greatestFactor = 1;
        for(int i=1; i<=n/2; i++) {
            if(n%i == 0) {
                greatestFactor = i;
            }
        }
        System.out.println("Greatest factor of " + n + " is: " + greatestFactor);
    }
}
