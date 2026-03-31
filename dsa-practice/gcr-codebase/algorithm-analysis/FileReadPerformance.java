import java.io.*;

public class FileReadPerformance {

    public static void main(String[] args) throws Exception {
        String filePath = "sample.txt";

        // Using FileReader
        long start = System.currentTimeMillis();
        FileReader fr = new FileReader(filePath);
        while (fr.read() != -1) {
            // reading character by character
        }
        fr.close();
        long end = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (end - start) + " ms");

        // Using InputStreamReader
        start = System.currentTimeMillis();
        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(filePath));
        while (isr.read() != -1) {
            // reading via byte stream
        }
        isr.close();
        end = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }
}
