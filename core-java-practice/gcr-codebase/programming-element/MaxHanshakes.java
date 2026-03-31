import java.util.Scanner;

public class MaxHanshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int combination = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes is: " + combination);
        sc.close();
    }
}
