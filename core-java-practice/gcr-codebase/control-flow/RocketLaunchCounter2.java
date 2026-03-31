import java.util.Scanner;

public class RocketLaunchCounter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        for(int i=n; i>0; i--) {
            System.out.println(n);
        }
    }
}
