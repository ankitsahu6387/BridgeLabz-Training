import java.util.*;
public class WordFrequencyCount {
    public static void main(String[] args) {
        String input = "hello world hello Java!";
        String newInput = input.toLowerCase();
        String text = newInput.replaceAll("[^a-z ]", "");
        String[] words = text.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
