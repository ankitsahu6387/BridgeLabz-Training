package jdbcdemo.jdbc;

import java.sql.Date;
import java.sql.Time;

import jdbcdemo.jdbc.dao.*;

public class Main {

    public static void main(String[] args) {

        DoctorDAO doctorDAO = new DoctorDAO();
        PatientDAO patientDAO = new PatientDAO();
        AppointmentDAO appointmentDAO = new AppointmentDAO();
        VisitDAO visitDAO = new VisitDAO();

        // 1. Add Doctor
        doctorDAO.addDoctor("Dr Sharma", "9999999999", 500);

        // 2. Add Patient
        patientDAO.addPatient("Ravi", 25, "Male");

        // 3. Book Appointment
        try {
			appointmentDAO.bookAppointment(
			        1,  // patient_id
			        1,  // doctor_id
			        Date.valueOf("2026-02-15"),
			        Time.valueOf("10:00:00")
			);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // 4. Record Visit
        try {
			visitDAO.recordVisit(
			        1,  // appointment_id
			        "Fever",
			        "Paracetamol"
			);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("All operations completed successfully");
    }
}
