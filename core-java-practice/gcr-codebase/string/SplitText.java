import java.util.Scanner;
public class SplitText {
    static int findStringLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
    static String[] splitTextManually(String text) {
        int len = findStringLength(text);
        int words = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }
        int[] spacePos = new int[words + 1];
        int index = 0;
        spacePos[index++] = -1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spacePos[index++] = i;
            }
        }
        spacePos[index] = len;
        String[] result = new String[words];
        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spacePos[i] + 1; j < spacePos[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            result[i] = word;
        }
        return result;
    }
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        String[] manualWords = splitTextManually(text);
        String[] builtInWords = text.split(" ");
        boolean sameResult = compareArrays(manualWords, builtInWords);
        System.out.println("\nWords using charAt():");
        for (String w : manualWords) {
            System.out.println(w);
        }
        System.out.println("\nWords using split():");
        for (String w : builtInWords) {
            System.out.println(w);
        }
        System.out.println("\nAre both results same? " + sameResult);
        sc.close();
    }
}
