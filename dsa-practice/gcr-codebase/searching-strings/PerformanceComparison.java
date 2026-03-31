import java.io.*;
import java.nio.charset.StandardCharsets;

public class PerformanceComparison {

    private static final int ITERATIONS = 1000000;
    private static final String TEXT = "hello";
    private static final String FILE_PATH = "largefile.txt"; // ~100MB file

    public static void main(String[] args) throws Exception {

        // StringBuilder Test
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(TEXT);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");

        // StringBuffer Test
        start = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbuf.append(TEXT);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");

        // FileReader Test
        start = System.currentTimeMillis();
        int fileReaderWords = countWordsUsingFileReader(FILE_PATH);
        end = System.currentTimeMillis();
        System.out.println("FileReader Word Count: " + fileReaderWords);
        System.out.println("FileReader Time: " + (end - start) + " ms");

        // InputStreamReader Test
        start = System.currentTimeMillis();
        int inputStreamReaderWords = countWordsUsingInputStreamReader(FILE_PATH);
        end = System.currentTimeMillis();
        System.out.println("InputStreamReader Word Count: " + inputStreamReaderWords);
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }

    //FileReader Method
    private static int countWordsUsingFileReader(String path) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        }
        return count;
    }

    //InputStreamReader Method
    private static int countWordsUsingInputStreamReader(String path) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        }
        return count;
    }
}
