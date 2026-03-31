import java.util.Scanner;
public class StringComparison {
    static boolean compareByChar(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        boolean charAtResult = compareByChar(str1, str2);
        boolean equalsResult = str1.equals(str2);
        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);
        if (charAtResult == equalsResult) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("The results are different.");
        }
        scanner.close();
    }
}
