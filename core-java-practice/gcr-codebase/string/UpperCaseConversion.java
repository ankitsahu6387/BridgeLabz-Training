import java.util.Scanner;

public class UpperCaseConversion {
    static String convertToUpperByChar(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
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
        String upperByChar = convertToUpperByChar(text);
        String upperBuiltIn = text.toUpperCase();
        boolean isEqual = compareStrings(upperByChar, upperBuiltIn);
        System.out.println("Uppercase using charAt(): " + upperByChar);
        System.out.println("Uppercase using toUpperCase(): " + upperBuiltIn);
        System.out.println("Are both conversions equal? " + isEqual);
        sc.close();
    }
}
