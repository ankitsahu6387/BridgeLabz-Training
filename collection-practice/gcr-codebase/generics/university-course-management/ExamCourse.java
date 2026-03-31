public class ExamCourse extends CourseType {
    public ExamCourse() {
        this.evaluationMethod = "Written Exam";
    }  
    @Override
    public String getEvaluationDetails() {
        return "Evaluation Type: " + evaluationMethod;
    }
}
