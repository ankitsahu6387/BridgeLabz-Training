import java.util.*;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
class Student {
    String name;
    String[] subjects;
    int[] marks;
    public Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        for (int m : marks) {
            if (m < 0 || m > 100)
                throw new InvalidMarkException("Marks should be between 0 and 100!");
        }
    }
}
class ReportGenerator {
    private List<Student> students = new ArrayList<>();
    public void addStudent(Student student) {
        students.add(student);
    }
    private double calculateAverage(int[] marks) {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum * 1.0 / marks.length;
    }
    private String assignGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }
    public void displayReports() {
        for (Student s : students) {
            System.out.println("\n===== Report Card =====");
            System.out.println("Student: " + s.name);
            for (int i = 0; i < s.subjects.length; i++) {
                System.out.println(s.subjects[i] + ": " + s.marks[i]);
            }
            double avg = calculateAverage(s.marks);
            String grade = assignGrade(avg);
            System.out.printf("Average: %.2f | Grade: %s\n", avg, grade);
            System.out.println();
        }
    }
}
public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReportGenerator generator = new ReportGenerator();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i + ":");
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter number of subjects: ");
            int subCount = sc.nextInt();
            sc.nextLine();
            String[] subjects = new String[subCount];
            int[] marks = new int[subCount];
            for (int j = 0; j < subCount; j++) {
                System.out.print("Enter subject " + (j + 1) + " name: ");
                subjects[j] = sc.nextLine();
                System.out.print("Enter marks for " + subjects[j] + ": ");
                marks[j] = sc.nextInt();
                sc.nextLine();
            }
            try {
                Student student = new Student(name, subjects, marks);
                generator.addStudent(student);
            } catch (InvalidMarkException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }
        generator.displayReports();
        sc.close();
    }
}
