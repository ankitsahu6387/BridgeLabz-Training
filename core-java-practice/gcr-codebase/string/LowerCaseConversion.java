import java.util.Scanner;

public class LowerCaseConversion {
    static String convertToLowerByChar(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            result += c;
        }
        return result;
    }
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the complete text: ");
        String text = sc.nextLine();
        String lowerByChar = convertToLowerByChar(text);
        String lowerBuiltIn = text.toLowerCase();
        boolean isEqual = compareStrings(lowerByChar, lowerBuiltIn);
        System.out.println("Lowercase using charAt(): " + lowerByChar);
        System.out.println("Lowercase using toLowerCase(): " + lowerBuiltIn);
        System.out.println("Are both conversions equal? " + isEqual);
        sc.close();
    }
}
