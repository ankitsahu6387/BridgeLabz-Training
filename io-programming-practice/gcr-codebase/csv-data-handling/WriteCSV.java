import java.io.*;
public class WriteCSV {

	public static void main(String[] args) {
		String filePath = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\student.csv";
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
			
			writer.write("ID,Name,Department,Salary");
            writer.newLine();

            writer.write("1,Amit,IT,60000");
            writer.newLine();

            writer.write("2,Riya,HR,55000");
            writer.newLine();

            writer.write("3,Karan,Finance,65000");
            writer.newLine();

            writer.write("4,Neha,Marketing,58000");
            writer.newLine();

            writer.write("5,Rahul,IT,70000");
            writer.newLine();

            System.out.println("CSV file written using BufferedWriter!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}