import java.io.*;
public class UpdateRecord {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csvDataHandling\\employees.csv";
		String outputFile = "C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csvDataHandling\\employees_updated.csv";
		try (
	            BufferedReader br = new BufferedReader(new FileReader(filePath));
	            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
	        ) {

	            String line;

	            bw.write(br.readLine());
	            bw.newLine();

	            while ((line = br.readLine()) != null) {

	                String[] data = line.split(",");

	                String department = data[2];
	                double salary = Double.parseDouble(data[3]);

	                if (department.equalsIgnoreCase("IT")) {
	                    salary = salary * 1.10;
	                }

	                bw.write(data[0] + "," + data[1] + "," + department + "," + (int) salary);
	                bw.newLine();
	            }

	            System.out.println("Salary update completed!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}