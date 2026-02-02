import java.io.*;
public class SearchRecord {

	public static void main(String[] args) {
		String searchName = "Riya";
        boolean found = false;
		String filePath = "C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csvDataHandling\\student.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[1];

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Student Found!");
                    System.out.println("Department: " + data[2]);
                    System.out.println("Marks    : " + data[3]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee not found.");
            }
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}