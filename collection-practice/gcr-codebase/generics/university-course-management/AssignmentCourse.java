public class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        this.evaluationMethod = "Assignments and Projects";
    }  
    @Override
    public String getEvaluationDetails() {
        return "Evaluation Type: " + evaluationMethod;
    }
    
}
