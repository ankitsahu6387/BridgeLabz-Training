import java.util.Scanner;

public class TrimSpacesUsingCharAt {
    static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }
    static String buildSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();
        int[] indexes = findTrimIndexes(input);
        String customTrimmed = buildSubstring(input, indexes[0], indexes[1]);
        String builtInTrimmed = input.trim();
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);
        System.out.println("After trimming (charAt logic): \"" + customTrimmed + "\"");
        System.out.println("After trimming (built-in): \"" + builtInTrimmed + "\"");
        System.out.println("Both results are same: " + isSame);
        sc.close();
    }
}
