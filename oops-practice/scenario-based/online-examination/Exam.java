import java.util.ArrayList;
import java.util.List;

public class Exam {
    private String title;
    private List<Question> questions;
    private boolean expired;

    public Exam(String title) {
        this.title = title;
        questions = new ArrayList<>();
        expired = false;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void expireExam() {
        expired = true;
    }

    public boolean isExpired() {
        return expired;
    }
}
