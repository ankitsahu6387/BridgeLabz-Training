public interface EvaluationStrategy {
    void evaluate(Student student, Exam exam) throws ExamTimeExpiredException;
}
