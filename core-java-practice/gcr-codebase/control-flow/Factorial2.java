import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int n = sc.nextInt();
        sc.close();
        for(int i=n-1; i>0; i--) {
            n *= i;
        }   
        System.out.println("Factorial is: " + n);
    }
}
