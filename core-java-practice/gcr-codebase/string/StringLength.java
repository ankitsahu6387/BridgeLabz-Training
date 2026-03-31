import java.util.Scanner;

public class StringLength {
    static int findLengthManually(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count); // keeps accessing characters
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int manualLength = findLengthManually(input);
        int builtInLength = input.length();
        System.out.println("Length without using length(): " + manualLength);
        System.out.println("Length using built-in length(): " + builtInLength);
        sc.close();
    }
}
