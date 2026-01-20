public class Course<T extends CourseType> {
    private String courseName;
    private T courseType;
    private int credit;

    public Course(String courseName, int credit, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.credit = credit;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getCourseDetails() {
        return "Course Name: " + courseName + ", Credit: " + credit + ", " + courseType.getEvaluationDetails();
    }    
}
