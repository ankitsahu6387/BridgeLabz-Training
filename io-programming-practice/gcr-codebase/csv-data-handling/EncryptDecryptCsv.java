import java.io.*;
import java.util.Base64;

public class EncryptDecryptCSV {

	public static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

	public static String decrypt(String data) {
        return new String(Base64.getDecoder().decode(data));
    }

    public static void main(String[] args) {
        String outputFile = "employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            bw.write("1,Amit,IT," + encrypt("60000"));
            bw.newLine();
            bw.write("2,Riya,HR," + encrypt("55000"));
            bw.newLine();

            System.out.println("Encrypted CSV written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(outputFile))) {

            String line = br.readLine();
            System.out.println(line);

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String name = data[1];
                String dept = data[2];
                String salary = decrypt(data[3]);

                System.out.println(id + "," + name + "," + dept + "," + salary);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

}