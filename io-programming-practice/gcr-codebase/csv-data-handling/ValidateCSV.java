import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {
	static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    static final String PHONE_REGEX = "\\d{10}";
	public static void main(String[] args) {
		String filePath = "users.csv";

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int rowNumber = 0;
            br.readLine();

            while ((line = br.readLine()) != null) {
                rowNumber++;
                String[] data = line.split(",");

                String email = data[2];
                String phone = data[3];

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Invalid Email at row " + rowNumber + ": " + line);
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Invalid Phone at row " + rowNumber + ": " + line);
                    valid = false;
                }

                if (!valid) {
                    System.out.println("Error: Invalid data\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}