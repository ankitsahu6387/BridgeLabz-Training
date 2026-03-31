import java.util.Scanner;

public class EvenOddOnetoN {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        scanner.close();
    }
}
