public class DescriptiveEvaluation implements EvaluationStrategy {

    @Override
    public void evaluate(Student student, Exam exam)
            throws ExamTimeExpiredException {

        if (exam.isExpired()) {
            throw new ExamTimeExpiredException("Exam time expired");
        }

        System.out.println("Descriptive Evaluation:");
        for (int i = 0; i < exam.getQuestions().size(); i++) {
            System.out.println("Q: " + exam.getQuestions().get(i).getText());
            System.out.println("A: " + student.getAnswers().get(i));
        }
    }
}
