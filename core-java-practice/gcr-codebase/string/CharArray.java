import java.util.Scanner;

public class CharArray {
    static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.next();
        char[] userArray = getChars(text);
        char[] builtInArray = text.toCharArray();
        boolean isEqual = compareCharArrays(userArray, builtInArray);
        System.out.print("Characters using user-defined method: ");
        for (char c : userArray) {
            System.out.print(c + " ");
        }
        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println("\nAre both character arrays equal? " + isEqual);
        sc.close();
    }
}
