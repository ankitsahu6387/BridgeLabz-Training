public class Patient {
    static String hospitalName = "City Hospital";
    final String patientID;
    String patientName;
    int patientAge;
    String ailment;
    int totalAdmittedPatient = 0;
    public Patient(String patientID, String patientName, int patientAge, String ailment){
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.ailment = ailment;
        totalAdmittedPatient++;
    }
    void getTotalPatient(){
        System.out.println("Total Patients Admitted: "+ totalAdmittedPatient);
    }
    public void display(){
        if(this instanceof Patient){
            System.out.println("Hospital Name: "+ hospitalName);
            System.out.println("Patient ID: "+ patientID);
            System.out.println("Patient Name: "+ patientName);
            System.out.println("Patient Age: "+ patientAge);
            System.out.println("Ailment: "+ ailment);
        }
    }
    public static void main(String[] args) {
        Patient p1 = new Patient("P001", "Lathika",30, "Flu");
        Patient p2 = new Patient("P002", "Lidiya", 45, "Fracture");
        p1.display();
        p2.display();
    }
}
