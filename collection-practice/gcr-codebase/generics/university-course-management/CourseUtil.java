import java.util.*;
public class CourseUtil {
    // Wildcard method
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getEvaluationDetails());
        }
    }
}
