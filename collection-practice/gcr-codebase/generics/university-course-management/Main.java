import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics", 4, new ExamCourse());
        Course<AssignmentCourse> cs = new Course<>("Computer Science", 5, new AssignmentCourse());
        Course<ResearchCourse> phd = new Course<>("AI Research", 6, new ResearchCourse());
        System.out.println(math.getCourseDetails());
        System.out.println(cs.getCourseDetails());
        System.out.println(phd.getCourseDetails());
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());
        System.out.println("\nEvaluation Methods:");
        CourseUtil.displayCourses(courseTypes);
    }
}
