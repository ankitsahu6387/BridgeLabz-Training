import java.util.Scanner;

public class NumberAnalysis {
    static boolean isPositive(int n) {
        return n >= 0;
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static int compare(int a, int b) {
        return a > b ? 1 : (a == b ? 0 : -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int n : arr) {
            if (isPositive(n)) {
                System.out.println(n + (isEven(n) ? " Positive Even" : " Positive Odd"));
            } else {
                System.out.println(n + " Negative");
            }
        }
        int r = compare(arr[0], arr[4]);
        if (r == 1) System.out.println("First > Last");
        else if (r == 0) System.out.println("First = Last");
        else System.out.println("First < Last");
        sc.close();
    }
}
