import java.io.*;
import java.util.*;

public class SortRecords {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csvDataHandling\\employees.csv";
		List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                records.add(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort by salary (descending)
        Collections.sort(records, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                double salaryA = Double.parseDouble(a[3]);
                double salaryB = Double.parseDouble(b[3]);
                return Double.compare(salaryB, salaryA); // descending
            }
        });

        System.out.println("Top 5 Highest-Paid Employees:");
        System.out.println("-----------------------------");

        for (int i = 0; i < Math.min(5, records.size()); i++) {
            String[] emp = records.get(i);
            System.out.println(
                emp[1] + " | " + emp[2] + " | Salary: " + emp[3]
            );
        }

	}

}