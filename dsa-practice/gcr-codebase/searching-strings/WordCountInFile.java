import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {
    public static void main(String[] args) {
        String filePath = "sample.txt";   // replace with your file path
        String targetWord = "java";       // word to count
        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("Occurrences of \"" + targetWord + "\": " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
