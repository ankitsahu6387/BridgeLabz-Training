package jdbcdemo.jdbc.dao;

import jdbcdemo.jdbc.util.DBConnection;
import java.sql.*;

public class PatientDAO {

	public void addPatient(String name, int age, String gender) {
	    try {
	        Connection con = DBConnection.getConnection();
	        String sql = "INSERT INTO patients (name, age, gender) VALUES (?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, name);
	        ps.setInt(2, age);
	        ps.setString(3, gender);
	        ps.executeUpdate();
	        System.out.println("Patient added");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


    public void viewPatients() throws Exception {

        String sql = "SELECT * FROM patients";

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("patient_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("phone")
                );
            }
        }
    }
}
