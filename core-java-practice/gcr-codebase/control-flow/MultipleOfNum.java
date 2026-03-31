import java.util.Scanner;
public class MultipleOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int n = sc.nextInt();
        sc.close();
        if(n<1 || n>100){
            System.out.println("Number should be between 1 and 100");
            return;
        }
        System.out.println("Multiples of " + n + " are:");
        for(int i=n-1; i>1; i--){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
}
