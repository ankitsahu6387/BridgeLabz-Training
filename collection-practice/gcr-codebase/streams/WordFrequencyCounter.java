import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String filePath = "sample.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue;
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file");
            e.printStackTrace();
        }

        // Total number of words
        int totalWords = wordCount.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total words: " + totalWords);

        // Sort by frequency and get top 5
        wordCount.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}
