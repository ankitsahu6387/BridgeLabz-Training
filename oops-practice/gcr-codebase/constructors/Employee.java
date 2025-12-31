class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Manager extends Employee {
    String designation;

    Manager(String employeeID, String department, double salary, String designation) {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    void displayManagerDetails() {
        System.out.println("Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (private via getter): " + getSalary());
        System.out.println("Designation: " + designation);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("E101", "IT", 50000);
        e1.displayEmployeeDetails();

        Manager m1 = new Manager("M201", "HR", 75000, "Team Lead");
        m1.displayManagerDetails();
    }
}
