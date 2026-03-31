import java.util.Scanner;

public class NumberChecker {
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
    static boolean isDuckNumber(int[] d) {
        for (int x : d)
            if (x != 0) return true;
        return false;
    }
    static boolean isArmstrong(int n, int[] d) {
        int p = d.length;
        int sum = 0;
        for (int x : d)
            sum += Math.pow(x, p);
        return sum == n;
    }
    static int[] largestAndSecondLargest(int[] d) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        return new int[]{max, second};
    }
    static int[] smallestAndSecondSmallest(int[] d) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min) {
                second = min;
                min = x;
            } else if (x < second && x != min) {
                second = x;
            }
        }
        return new int[]{min, second};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = getDigits(n);
        System.out.println("Digit Count: " + countDigits(n));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(n, digits));
        int[] max = largestAndSecondLargest(digits);
        int[] min = smallestAndSecondSmallest(digits);
        System.out.println("Largest: " + max[0] + " Second Largest: " + max[1]);
        System.out.println("Smallest: " + min[0] + " Second Smallest: " + min[1]);
        sc.close();
    }
}
