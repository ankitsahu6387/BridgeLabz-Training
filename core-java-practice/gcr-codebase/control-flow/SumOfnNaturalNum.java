import java.util.Scanner;

public class SumOfnNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(n<0){
            System.out.println("The number "+ n + " is not a natural number");
            return;
        }
        else{
            System.out.println("Sum of " + n + " natural numbers is: " + (n*(n+1))/2);
        }
    }
}
