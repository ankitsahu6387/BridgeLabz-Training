import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExamProctor {

    private Stack<Integer> navigationStack; // Tracks question navigation
    private Map<Integer, String> answers;   // Stores student answers
    private Map<Integer, String> correctAnswers; // Correct answer key

    public ExamProctor() {
        navigationStack = new Stack<>();
        answers = new HashMap<>();
        correctAnswers = new HashMap<>();
    }

    // Add correct answers for the exam
    public void setCorrectAnswers(Map<Integer, String> correctAnswers) {
        this.correctAnswers.putAll(correctAnswers);
    }

    // Navigate to a question
    public void visitQuestion(int questionID) {
        navigationStack.push(questionID);
        System.out.println("Visited Question " + questionID);
    }

    // Submit answer for a question
    public void submitAnswer(int questionID, String answer) {
        answers.put(questionID, answer);
        System.out.println("Answer submitted for Q" + questionID + ": " + answer);
    }

    // Display navigation history (last visited first)
    public void showNavigationHistory() {
        System.out.println("\nNavigation History (last visited first):");
        Stack<Integer> tempStack = (Stack<Integer>) navigationStack.clone();
        while (!tempStack.isEmpty()) {
            System.out.print("Q" + tempStack.pop() + " ");
        }
        System.out.println();
    }

    // Auto-calculate score
    public int calculateScore() {
        int score = 0;
        for (Map.Entry<Integer, String> entry : correctAnswers.entrySet()) {
            int qID = entry.getKey();
            String correct = entry.getValue();
            String studentAnswer = answers.get(qID);
            if (studentAnswer != null && studentAnswer.equalsIgnoreCase(correct)) {
                score++;
            }
        }
        return score;
    }
}
