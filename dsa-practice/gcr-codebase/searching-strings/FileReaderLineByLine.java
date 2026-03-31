import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLineByLine {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // replace with your file path

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
