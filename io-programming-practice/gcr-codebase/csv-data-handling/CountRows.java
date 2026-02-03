import java.io.*;
public class CountRows {

	public static void main(String[] args) {
		int rowCount = 0;
		String filePath = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\student.csv";
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;
			br.readLine();
			while((line = br.readLine())!= null) {
				String data[] = line.split(",");
				System.out.println("ID    : " + data[0]);
                System.out.println("Name  : " + data[1]);
                System.out.println("Age   : " + data[2]);
                System.out.println("Marks : " + data[3]);
                System.out.println("----------------------");
                rowCount++;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Number of rows: "+rowCount);

	}

}