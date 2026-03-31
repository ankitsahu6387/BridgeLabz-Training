import java.io.*;

public class MergeTwoCSV {

	public static void main(String[] args) {
		String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "students_merged.csv";

        try (
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line1;
            String[][] data1 = new String[100][3];
            int index1 = 0;

            br1.readLine();
            while ((line1 = br1.readLine()) != null) {
                data1[index1++] = line1.split(",");
            }

            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            br2.readLine(); 
            String line2;
            while ((line2 = br2.readLine()) != null) {
                String[] data2 = line2.split(",");
                String id2 = data2[0];
                for (int i = 0; i < index1; i++) {
                    if (data1[i][0].equals(id2)) {
                        bw.write(
                            id2 + "," + data1[i][1] + "," + data1[i][2] + "," + data2[1] + "," + data2[2]
                        );
                        bw.newLine();
                        break;
                    }
                }
            }

            System.out.println("CSV merged successfully (no Map used)!");

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}