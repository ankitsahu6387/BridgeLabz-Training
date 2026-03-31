import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFile {
    public static void main(String[] args) {
        String filePath = "output.txt";
        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath, true) // append mode
        ) {
            String input;
            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                input = br.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                fw.write(input + System.lineSeparator());
            }
            System.out.println("Input saved to file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
