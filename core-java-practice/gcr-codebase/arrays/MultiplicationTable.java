import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int arr[] = new int[10];
        sc.close();
        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = num * i;
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
