import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        String str = takeInput();
        boolean isPalin = checkPalindrome(str);
        displayResult(str, isPalin);
    }
    static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        return input;
    }
    static boolean checkPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase(); // ignore spaces & case
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    static void displayResult(String s, boolean isPalindrome) {
        if (isPalindrome) System.out.println("\"" + s + "\" is a Palindrome");
        else System.out.println("\"" + s + "\" is NOT a Palindrome");
    }
}
