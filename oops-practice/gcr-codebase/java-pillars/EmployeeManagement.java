import java.util.*;
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double basesalary;
    private String department;

    Employee(int employeeId, String name, double basesalary){
        this.employeeId = employeeId;
        this.name = name;
        this.basesalary = basesalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return basesalary;
    }
    public void setBaseSalary(double basesalary){
        this.basesalary = basesalary;
    }
    public void assignDepartment(String dept){
        this.department = dept;
    }
    public String getDepartmentDetails(){
        return department;
    }
    abstract double calculateSalary();

    void displayDetails(){
        System.out.println("Employee ID: "+employeeId+" Name: "+name+" Department: "+department+" Salary: "+calculateSalary());
    }
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(int id, String name, double Salary){
        super(id, name, Salary);
    }
    double calculateSalary(){
        return getBaseSalary();
    }
}
class PartTimeEmployee extends Employee{
    private int hourWorked;
    private double hourlyRate;
    PartTimeEmployee(int id, String name, int hourWorked, double hourlyRate){
        super(id, name, 0);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }
    double calculateSalary(){
        return hourWorked * hourlyRate;
    }
}

public class EmployeeManagement {
    public static void main(String args[]) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new FullTimeEmployee(101, "Ankit", 50000);
        Employee e2 = new PartTimeEmployee(102, "ABC", 80, 300);

        e1.assignDepartment("IT");
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);
        for(Employee e: employees){
            e.displayDetails();
        }
    }
}
