class Student {
    String name;
    String rollNumber;
    double mark1, mark2, mark3;
    char grade;
    Student(String name, String rollNumber, double mark1, double mark2, double mark3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    void calculateGrade() {
        double average = (mark1 + mark2 + mark3) / 3;
        if (average >= 80) grade = 'A';
        else if (average >= 70) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 50) grade = 'D';
        else grade = 'F';
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Grade " + grade);
        System.out.println("------------------------");
    }
}
public class StudentReport {
    public static void main(String[] args) {
        Student s1 = new Student("Thamarai", "ECE001", 80, 70, 75);
        Student s2 = new Student("Kannan", "CSC002", 60, 65, 50);
        s1.calculateGrade();
        s1.displayDetails();
        s2.calculateGrade();
        s2.displayDetails();
    }
}
