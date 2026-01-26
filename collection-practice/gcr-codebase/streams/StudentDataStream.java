import java.io.*;

public class StudentDataStream {

    static final String FILE_NAME = "student.dat";

    public static void main(String[] args) {

        // 🔹 Write data to file
        writeStudentData(101, "Ankit", 8.7);

        // 🔹 Read data from file
        readStudentData();
    }

    // Write primitive data using DataOutputStream
    static void writeStudentData(int rollNo, String name, double gpa) {

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(FILE_NAME))) {

            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully!");

        } catch (IOException e) {
            System.out.println("Error while writing student data.");
            e.printStackTrace();
        }
    }

    // Read primitive data using DataInputStream
    static void readStudentData() {

        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(FILE_NAME))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Details:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading student data.");
            e.printStackTrace();
        }
    }
}
