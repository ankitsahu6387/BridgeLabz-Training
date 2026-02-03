import java.io.*;
import java.util.*;

public class DetectDuplicates {

	public static void main(String[] args) {
		HashSet<String> ids = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
		String filePath = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\student.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (!ids.add(id)) { // returns false if id already exists
                    duplicates.add(line);
                }
            }

            if (duplicates.isEmpty()) {
                System.out.println("No duplicate records found.");
            } else {
                System.out.println("Duplicate records:");
                for (String dup : duplicates) {
                    System.out.println(dup);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}