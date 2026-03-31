public class Student {
    static String universityName="Global University";
    String name; 
    final String rollNumber;
    String grade;
    static int totalStudent = 0;

    public Student(String name, String rollNumber, String grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudent++;
    }
    public void display(){
        if(this instanceof Student){
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
    public void gradeUpdate(String newGrade){
        this.grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }

    public static void displayTotalStudents(){
        System.out.println("Total Student Enrolled: "+totalStudent);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Hemashree", "101", "B");
       
        Student s2 = new Student("Sharmila paji", "102", "B");
        Student.displayTotalStudents();
        s1.display();
        s2.display();
        s2.gradeUpdate("A");

    }

}
