import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (separated by space): ");
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int num : arr) {
            if (num > 0) {
                if(num % 2 == 0) {
                    System.out.println("Positive even");
                } else {
                    System.out.println("Positive odd");
                }
            } else if (num < 0) {
                System.out.println("Negative.");
            } else {
                System.out.println("Zero.");
            }
        }
    }    
}
