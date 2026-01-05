class EduQuiz {

    static int calculateScore(String[] correct, String[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String[] correctAnswers = {
                "A", "B", "C", "D", "A",
                "C", "B", "D", "A", "B"
        };
        String[] studentAnswers = {
                "a", "B", "d", "D", "A",
                "c", "b", "C", "A", "b"
        };
        int score = calculateScore(correctAnswers, studentAnswers);
        double percentage = (score / 10.0) * 100;
        System.out.println("Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println(percentage >= 40 ? "Status: Pass" : "Status: Fail");
    }
}
