public class RegistrationServiceImpl extends RegistrationService {

    @Override
    public void enroll(Student student, Course course)
            throws CourseLimitExceededException {
        student.addCourse(course);
        System.out.println("Enrolled in " + course.getTitle());
    }

    @Override
    public void drop(Student student, Course course) {
        student.dropCourse(course);
        System.out.println("Dropped " + course.getTitle());
    }
}
