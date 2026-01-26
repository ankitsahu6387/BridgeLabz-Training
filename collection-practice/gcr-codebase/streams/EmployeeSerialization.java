import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

    static final String FILE_NAME = "employees.ser";

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ankit", "IT", 50000));
        employees.add(new Employee(102, "Rahul", "HR", 45000));
        employees.add(new Employee(103, "Priya", "Finance", 55000));

        // Serialize
        serializeEmployees(employees);

        // Deserialize
        deserializeEmployees();
    }

    // 🔹 Serialize method
    static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully!");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
            e.printStackTrace();
        }
    }

    // 🔹 Deserialize method
    static void deserializeEmployees() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("\nRetrieved Employees:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
            e.printStackTrace();
        }
    }
}
