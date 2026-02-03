import java.io.*;
public class FilterRecords {

	public static void main(String[] args) {
		String filePath = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\student.csv";
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			br.readLine();
			while((line = br.readLine())!= null) {
				String data[] = line.split(",");
				if((Integer.parseInt(data[3]))>80) {
					System.out.println("ID    : " + data[0]);
	                System.out.println("Name  : " + data[1]);
	                System.out.println("Age   : " + data[2]);
	                System.out.println("Marks : " + data[3]);
	                System.out.println("----------------------");
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}