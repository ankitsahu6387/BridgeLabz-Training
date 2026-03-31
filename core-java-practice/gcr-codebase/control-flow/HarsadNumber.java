import java.util.Scanner;
public class HarsadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int temp = n;
        while(temp != 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        if (n % sum == 0) {
            System.out.println(n + " is a Harshad Number");
        } else {
            System.out.println(n + " is not a Harshad Number");
        }   
    }
}
