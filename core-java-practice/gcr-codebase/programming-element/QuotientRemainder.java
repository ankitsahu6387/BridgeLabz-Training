import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println(" The Quotient is " + quotient + " and Reminder is " + remainder + " of two number "
                + dividend + " and " + divisor);
        sc.close();
    }
}
