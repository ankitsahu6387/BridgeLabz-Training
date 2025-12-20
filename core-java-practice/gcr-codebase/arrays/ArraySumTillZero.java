import java.util.Scanner;

public class ArraySumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;
        while (true && index < 10) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            arr[index] = num;
            index++;
        }

        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println("Sum of all numbers: " + total);
        sc.close();
    }
}
