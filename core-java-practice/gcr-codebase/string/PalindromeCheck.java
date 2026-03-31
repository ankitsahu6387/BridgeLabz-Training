import java.util.Scanner;

public class PalindromeCheck {
    static boolean checkPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }
    static char[] reverseText(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }
    static boolean checkPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseText(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Using Loop Logic: " + checkPalindromeLoop(text));
        System.out.println("Using Recursion Logic: " + checkPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Using Array Logic: " + checkPalindromeArray(text));
        sc.close();
    }
}
