import java.util.Scanner;

public class RocketLaunchCounter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        while(n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
