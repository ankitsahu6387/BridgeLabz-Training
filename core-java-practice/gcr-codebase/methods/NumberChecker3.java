import java.util.Scanner;

public class NumberChecker3 {

    static int countDigits(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }
    static int[] getDigits(int n) {
        int size = countDigits(n);
        int[] d = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }
    static int[] reverseArray(int[] d) {
        int[] rev = new int[d.length];
        for (int i = 0; i < d.length; i++) {
            rev[i] = d[d.length - 1 - i];
        }
        return rev;
    }
    static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }
    static boolean isPalindrome(int[] d) {
        return compareArrays(d, reverseArray(d));
    }
    static boolean isDuckNumber(int[] d) {
        for (int x : d) if (x != 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = getDigits(n);
        System.out.println("Digit Count: " + countDigits(n));
        System.out.println("Reversed Array:");
        int[] rev = reverseArray(digits);
        for (int x : rev) System.out.print(x + " ");
        System.out.println();
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        sc.close();
    }
}
