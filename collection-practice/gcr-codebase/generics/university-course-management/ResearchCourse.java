public class ResearchCourse extends CourseType {
    public ResearchCourse(){
        this.evaluationMethod = "Research Paper and Presentation";
    }    
    @Override
    public String getEvaluationDetails() {
        return "Evaluation Type: " + evaluationMethod;
    }
}
