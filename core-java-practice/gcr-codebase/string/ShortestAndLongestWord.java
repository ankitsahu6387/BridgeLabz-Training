import java.util.Scanner;

public class ShortestAndLongestWord {
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
    static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] indexes = new int[wordCount + 1];
        int pos = 0;
        indexes[pos++] = -1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                indexes[pos++] = i;
            }
        }
        indexes[pos] = len;
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }
    static String[][] mapWordLength(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            data[i][0] = words[i];
            data[i][1] = String.valueOf(len);
        }
        return data;
    }
    static int[] findShortestAndLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            int value = Integer.parseInt(data[i][1]);
            if (value < min) {
                min = value;
                minIndex = i;
            }
            if (value > max) {
                max = value;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] wordData = mapWordLength(words);
        int[] result = findShortestAndLongest(wordData);
        System.out.println("\nShortest Word: " + wordData[result[0]][0] +
                " (" + wordData[result[0]][1] + ")");
        System.out.println("Longest Word: " + wordData[result[1]][0] +
                " (" + wordData[result[1]][1] + ")");
        sc.close();
    }
}
