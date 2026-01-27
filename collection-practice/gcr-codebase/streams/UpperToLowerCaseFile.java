import java.io.*;

public class UpperToLowerCaseFile {

    public static void main(String[] args) {

        String sourceFile = "sample.txt";
        String destFile = "output.txt";

        // Explicit charset handling
        try (
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(sourceFile), "UTF-8"));
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(destFile), "UTF-8"))
        ) {
            int ch;

            // Read character by character
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted to lowercase successfully!");

        } catch (IOException e) {
            System.out.println("Error while processing the file.");
            e.printStackTrace();
        }
    }
}
