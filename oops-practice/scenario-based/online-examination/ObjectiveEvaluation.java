public class ObjectiveEvaluation implements EvaluationStrategy {

    @Override
    public void evaluate(Student student, Exam exam)
            throws ExamTimeExpiredException {

        if (exam.isExpired()) {
            throw new ExamTimeExpiredException("Exam time expired");
        }

        int score = 0;

        for (int i = 0; i < exam.getQuestions().size(); i++) {
            String correct = exam.getQuestions().get(i).getCorrectAnswer();
            String submitted = student.getAnswers().get(i);

            if (correct.equalsIgnoreCase(submitted)) {
                score++;
            }
        }

        System.out.println(student.getName()
                + " scored " + score + " / " + exam.getQuestions().size());
    }
}
