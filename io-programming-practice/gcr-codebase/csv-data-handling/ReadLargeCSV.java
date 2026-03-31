import java.io.*;

public class ReadLargeCSV {

	public static void main(String[] args) {
		
		String filePath = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\student.csv";
        int chunkSize = 100;
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int chunkCount = 0;

            String header = br.readLine();

            String[] chunk = new String[chunkSize];
            int index = 0;

            while ((line = br.readLine()) != null) {

                chunk[index++] = line;

                if (index == chunkSize) {
                    chunkCount++;
                    totalRecords += index;
                    System.out.println("Processed chunk " + chunkCount + " (Records: " + totalRecords + ")");
                    index = 0;
                }
            }

            if (index > 0) {
                chunkCount++;
                totalRecords += index;
                System.out.println("Processed chunk " + chunkCount + " (Records: " + totalRecords + ")");
            }

            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}