import java.util.Scanner;

public class NumberChecker2 {

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

    static int sumOfDigits(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static int sumOfSquares(int[] d) {
        int s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    static boolean isHarshad(int n, int[] d) {
        int sum = sumOfDigits(d);
        return sum != 0 && n % sum == 0;
    }

    static int[][] digitFrequency(int[] d) {
        int[][] f = new int[10][2];
        for (int i = 0; i < 10; i++) f[i][0] = i;
        for (int x : d) f[x][1]++;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digit Count: " + countDigits(n));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(n, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++)
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);

        sc.close();
    }
}
