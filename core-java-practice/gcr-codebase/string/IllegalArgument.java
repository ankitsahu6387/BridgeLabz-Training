import java.util.Scanner;

public class IllegalArgument {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.println("\nDemonstrating IllegalArgumentException (unhandled):");
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: start index cannot be greater than end index!");
        }
        System.out.println("\nDemonstrating IllegalArgumentException (handled safely):");
        try {
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled safely: start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Handled a general runtime exception.");
        }
        sc.close();
    }
}
