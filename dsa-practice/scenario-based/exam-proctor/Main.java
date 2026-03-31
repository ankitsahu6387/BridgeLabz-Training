import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ExamProctor student = new ExamProctor();

        // Set correct answers for 5 questions
        Map<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
        correctAnswers.put(5, "A");
        student.setCorrectAnswers(correctAnswers);

        // Student navigates and submits answers
        student.visitQuestion(1);
        student.submitAnswer(1, "A");

        student.visitQuestion(2);
        student.submitAnswer(2, "C");

        student.visitQuestion(3);
        student.submitAnswer(3, "C");

        student.visitQuestion(4);
        student.submitAnswer(4, "D");

        student.visitQuestion(5);
        student.submitAnswer(5, "B");

        // Show navigation history
        student.showNavigationHistory();

        // Auto-calculate score
        int totalScore = student.calculateScore();
        System.out.println("\nTotal Score: " + totalScore + "/" + correctAnswers.size());
    }
}
