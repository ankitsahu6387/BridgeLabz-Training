import java.io.*;
import java.util.*;

public class JsonCsvCoversion {

	public static void main(String[] args) {
		String jsonInput = "students.json";
        String csvOutput = "students.csv";
        String jsonOutput = "students_new.json";

        jsonToCsv(jsonInput, csvOutput);
        csvToJson(csvOutput, jsonOutput);

	}
	
	public static void jsonToCsv(String jsonFile, String csvFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

            bw.write("id,name,age,marks");
            bw.newLine();

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("{") && line.endsWith("},")) line = line.substring(0, line.length()-1);

                if (line.startsWith("{") && line.endsWith("}")) {
                    line = line.substring(1, line.length()-1); 
                    String[] fields = line.split(",");
                    List<String> values = new ArrayList<>();
                    for (String f : fields) {
                        String[] kv = f.split(":");
                        values.add(kv[1].replaceAll("\"", ""));
                    }
                    bw.write(String.join(",", values));
                    bw.newLine();
                }
            }

            System.out.println("JSON converted to CSV successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void csvToJson(String csvFile, String jsonFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile))) {

            String line = br.readLine(); 
            bw.write("[\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                bw.write("  {\"id\":" + data[0] +
                        ",\"name\":\"" + data[1] + "\"" +
                        ",\"age\":" + data[2] +
                        ",\"marks\":" + data[3] + "},\n");
            }

            bw.write("]"); 

            System.out.println("CSV converted to JSON successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}