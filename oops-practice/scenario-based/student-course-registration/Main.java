public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "Ankit");
        RegistrationService service = new RegistrationServiceImpl();

        Course c1 = new Course("CS101", "Java");
        Course c2 = new Course("CS102", "DSA");
        Course c3 = new Course("CS103", "DBMS");
        Course c4 = new Course("CS104", "OS");

        try {
            service.enroll(student, c1);
            service.enroll(student, c2);
            service.enroll(student, c3);
            service.enroll(student, c4); // Exception
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        student.addGrade("CS101", "A");
        student.addGrade("CS102", "B+");

        student.viewGrades();
    }
}
