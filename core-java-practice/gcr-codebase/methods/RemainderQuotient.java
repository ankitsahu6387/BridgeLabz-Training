import java.util.Scanner;

public class RemainderQuotient {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        return new int[] {number%divisor, number/divisor};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        int ans[] = findRemainderAndQuotient(number, divisor);  
        System.out.println("Remainder is " + ans[0] + " and quptient is " + ans[1]);
        sc.close();
    }
}
