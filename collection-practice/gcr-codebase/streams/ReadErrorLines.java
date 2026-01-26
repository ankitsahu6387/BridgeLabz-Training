import java.io.*;

public class ReadErrorLines {

    public static void main(String[] args) {

        String filePath = "largefile.txt"; // 500MB+ file

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Problem reading the file");
        }
    }
}
