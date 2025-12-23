import java.util.Scanner;

public class WordsWithLength {
    static int findLength(String text) {
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
    static String[] splitText(String text) {
        int len = findLength(text);
        int words = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }
        int[] spaces = new int[words + 1];
        int pos = 0;
        spaces[pos++] = -1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaces[pos++] = i;
            }
        }
        spaces[pos] = len;
        String[] result = new String[words];
        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaces[i] + 1; j < spaces[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            result[i] = word;
        }
        return result;
    }
    static String[][] createTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(len);
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitText(text);
        String[][] data = createTable(words);
        System.out.println("\nWord\tLength");
        System.out.println("--------------");
        for (int i = 0; i < data.length; i++) {
            int value = Integer.parseInt(data[i][1]);
            System.out.println(data[i][0] + "\t" + value);
        }
        sc.close();
    }
}
