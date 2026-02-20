import java.util.*;
import java.util.stream.Collectors;
class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}
public class StudentResultGrouping {
     public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Ankit", "A"),
            new Student("Rahul", "B"),
            new Student("Priya", "A"),
            new Student("Neha", "B"),
            new Student("Amit", "C")
        );

        Map<String, List<String>> groupedStudents =
                students.stream()
                        .collect(Collectors.groupingBy(
                            s -> s.grade,
                            Collectors.mapping(s -> s.name, Collectors.toList())
                        ));

        groupedStudents.forEach((grade, names) -> 
            System.out.println(grade + " : " + names)
        );
    }
}
