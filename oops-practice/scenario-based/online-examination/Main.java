public class Main {
    public static void main(String[] args) {

        Exam exam = new Exam("Java Test");

        exam.addQuestion(new Question("What is JVM?", "Java Virtual Machine"));
        exam.addQuestion(new Question("What is JDK?", "Java Development Kit"));

        Student student = new Student(1, "Ankit");

        student.submitAnswer("Java Virtual Machine");
        student.submitAnswer("Java Development Kit");

        EvaluationStrategy eval = new ObjectiveEvaluation();

        try {
            eval.evaluate(student, exam);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }

        exam.expireExam();

        try {
            eval.evaluate(student, exam);
        } catch (ExamTimeExpiredException e) {
            System.out.println("After expiry: " + e.getMessage());
        }
    }
}
