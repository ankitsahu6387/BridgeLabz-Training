interface IPayable {
    double calculateBill();
}
// Base Class (Encapsulation)
class Patient {
    protected int id;
    protected String name;
    protected int age;
    public Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Patient: " + name + ", Age: " + age);
    }
}
// Inheritance + Polymorphism
class InPatient extends Patient implements IPayable {
    private int days;
    private double dailyCharge;
    public InPatient(int id, String name, int age, int days, double dailyCharge) {
        super(id, name, age);
        this.days = days;
        this.dailyCharge = dailyCharge;
    }
    @Override
    public double calculateBill() {
        return days * dailyCharge;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: InPatient, Bill: " + calculateBill());
    }
}
class OutPatient extends Patient implements IPayable {
    private double consultationFee;
    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill() {
        return consultationFee;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: OutPatient, Bill: " + calculateBill());
    }
}
class Doctor {
    String name;
    String specialization;
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Ankit", 22, 5, 2000);
        Patient p2 = new OutPatient(2, "Rahul", 25, 500);
        p1.displayInfo(); 
        p2.displayInfo();
    }
}
