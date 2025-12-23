import java.util.Scanner;

public class StringIndexOutOfBound {
    static void generateException(String text) {
        System.out.println("Character at index 10: " + text.charAt(10));
    }
    static void handleException(String text) {
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method.");
        }
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(input);
        sc.close();
    }
}
