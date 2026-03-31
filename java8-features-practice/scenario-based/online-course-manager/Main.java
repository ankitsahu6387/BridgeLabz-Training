import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Sample Data
        List<Enrollment> enrollments = Arrays.asList(
                new Enrollment("Ankit", "Java Basics", "Programming", LocalDate.of(2024, 1, 10)),
                new Enrollment("Rahul", "Python Basics", "Programming", LocalDate.of(2024, 2, 5)),
                new Enrollment("Sneha", "Digital Marketing", "Marketing", LocalDate.of(2024, 1, 20)),
                new Enrollment("Priya", "Java Basics", "Programming", LocalDate.of(2024, 3, 1)),
                new Enrollment("Amit", "SEO Mastery", "Marketing", LocalDate.of(2024, 2, 15))
        );

        // Filter by Course
        System.out.println("\nFilter by Course: Java Basics");
        enrollments.stream().filter(e -> e.getCourseName().equals("Java Basics")).forEach(System.out::println);

        // Filter by Category
        System.out.println("\nFilter by Category: Marketing");
        enrollments.stream().filter(e -> e.getCategory().equals("Marketing")).forEach(System.out::println);

        // Group by Course Name
        System.out.println("\nGroup by Course: ");
        Map<String, List<Enrollment>> groupedByCourse = enrollments.stream().collect(Collectors.groupingBy(Enrollment::getCourseName));

        groupedByCourse.forEach((course, list) -> {
            System.out.println(course);
            list.forEach(System.out::println);
        });

        // Count Enrollments per Category
        System.out.println("\nCount per Category: ");
        Map<String, Long> countByCategory =enrollments.stream().collect(Collectors.groupingBy(Enrollment::getCategory,Collectors.counting()));

        countByCategory.forEach((category, count) -> System.out.println(category + " : " + count));

        // Sort by Enrollment Date
        System.out.println("\nSorted by Enrollment Date: ");
        enrollments.stream().sorted(Comparator.comparing(Enrollment::getEnrollmentDate)).forEach(System.out::println);
    }
}
