public class Employee {
    static String companyName = "Tech Solutions Inc";
    String name;
    final String id;
    String designation;
    public static int employeeCount = 0;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        employeeCount++;
    }

    public static void displayTotalEmployee() {
        System.out.println("Total Employee: "+  employeeCount);
    }

    void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee designation: " + designation);
    }

    public static void main(String[] args) {
        Employee E1 = new Employee("Thamarai", "101", "Software Engineer");
        Employee E2 = new Employee("Rohan", "102", "Project Manager");
        Employee.displayTotalEmployee();
        E1.display();
        E2.display();
    }
}
