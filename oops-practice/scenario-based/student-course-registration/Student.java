import java.util.*;

public class Student extends Person {

    private List<Course> courses;
    private Map<String, String> grades;
    private static final int MAX_COURSES = 3;

    public Student(int id, String name) {
        super(id, name);
        courses = new ArrayList<>();
        grades = new HashMap<>();
    }

    public void addCourse(Course course) throws CourseLimitExceededException {
        if (courses.size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Maximum course limit reached");
        }
        courses.add(course);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
        grades.remove(course.getCode());
    }

    public void addGrade(String courseCode, String grade) {
        grades.put(courseCode, grade);
    }

    public void viewGrades() {
        for (Map.Entry<String, String> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
