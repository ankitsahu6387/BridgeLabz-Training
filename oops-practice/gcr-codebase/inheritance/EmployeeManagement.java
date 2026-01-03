class Employee{
    String name;
    int id;
    int salary;
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+ salary);
    }
}
class Manager extends Employee{
    int teamSize;    
    public Manager(String name, int id, int salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name, int id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
class Intern extends Employee{
    public Intern(String name, int id, int salary){
        super(name, id, salary);
    }
    void displayDetails(){
        super.displayDetails();
    }
}
public class  EmployeeManagement {
    public static void main(String args[]){
        Manager m1 = new Manager("manu", 1, 100, 5);
        m1.displayDetails();
        Developer d1 = new Developer("devu", 2, 50,"JAVA");
        d1.displayDetails();
        Intern n1 = new Intern("intu", 3, 20);
        n1.displayDetails();
    }
}
