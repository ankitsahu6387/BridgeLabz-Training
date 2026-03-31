import java.util.*;
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println(patientId + " " + name + " " + age);
    }
}
interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private List<String> medicalHistory = new ArrayList<>();
    public InPatient(String id, String name, int age, int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
    public void addRecord(String diagnosis) {
        medicalHistory.add(diagnosis);
    }
    public void viewRecords() {
        for (String record : medicalHistory)
            System.out.println(record);
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory = new ArrayList<>();
    public OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }
    public double calculateBill() {
        return consultationFee;
    }
    public void addRecord(String diagnosis) {
        medicalHistory.add(diagnosis);
    }
    public void viewRecords() {
        for (String record : medicalHistory)
            System.out.println(record);
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient("P101", "Ravi", 45, 5, 2000));
        patients.add(new OutPatient("P102", "Anita", 30, 500));
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println(p.calculateBill());
        }
    }
}
