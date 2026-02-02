import java.sql.*;
import java.io.*;

public class DatabaseToCSV {

	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "root";
        String password = "password";
        String outputFile = "employees.csv";

        String query = "SELECT emp_id, name, department, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            while (rs.next()) {
                bw.write(rs.getInt("emp_id") + "," +
                         rs.getString("name") + "," +
                         rs.getString("department") + "," +
                         rs.getDouble("salary"));
                bw.newLine();
            }

            System.out.println("CSV report generated successfully!");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

	}

}