public abstract class RegistrationService {

    public abstract void enroll(Student student, Course course)
            throws CourseLimitExceededException;

    public abstract void drop(Student student, Course course);
}
