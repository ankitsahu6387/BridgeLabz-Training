import java.util.Scanner;

public class SumOfNaturalNum {
    public static int nNaturalNumSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " natural numbers is: " + nNaturalNumSum(n));
        sc.close();
    }
}
