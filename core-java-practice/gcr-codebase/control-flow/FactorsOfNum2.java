import java.util.Scanner;

public class FactorsOfNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factors of " + n + " are:");
        int i = 1;
        while(i < n) {
            if(n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
