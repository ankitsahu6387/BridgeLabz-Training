import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<String> answers;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        answers = new ArrayList<>();
    }

    public void submitAnswer(String answer) {
        answers.add(answer);
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getName() {
        return name;
    }
}
