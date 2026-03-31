class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Teacher extends Person{
    String subject;
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    void displayRole(){
        super.displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("subject: "+subject);
    }
}
class Student extends Person{
    String grade;
    public Student(String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }
    void displayRole(){
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: "+grade);
    }

}
class Staff extends Person{
    String work;
    public Staff(String name, int age, String work){
        super(name, age);
        this.work = work;
    }
    void displayRole(){
        super.displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Work: "+work);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Jaykaran", 41, "Math");
        t1.displayRole();
        Student s1 = new Student("Ankit", 21, "A");
        s1.displayRole();
    }
}
