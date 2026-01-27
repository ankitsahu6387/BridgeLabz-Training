import java.io.*;
public class TryWithResources {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        try  {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
            br.close();
        }
        catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
