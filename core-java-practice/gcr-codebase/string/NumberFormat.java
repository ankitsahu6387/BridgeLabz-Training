import java.util.Scanner;

public class NumberFormat {
    static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: The input is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("A general runtime exception was handled.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert to number: ");
        String input = sc.next();
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main method.");
        }
        System.out.println("\nHandling NumberFormatException safely:");
        handleException(input);
        sc.close();
    }
}
