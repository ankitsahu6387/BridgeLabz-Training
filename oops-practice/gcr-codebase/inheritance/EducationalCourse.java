class Course{
    String courseName;
    String duration;
    public Course(String courseName, String duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayDetails(){
        System.out.println("courseName: "+courseName);
        System.out.println("duration: "+duration);
    }
}
class OnlineCourse extends Course{
    String platform;
    String isRecorded;
    public OnlineCourse(String courseName, String duration, String platform,
    String isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("platform: "+platform);
        System.out.println("isRecorded: "+isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    String fee; 
    String discount;
    public PaidOnlineCourse(String courseName, String duration, String platform,
    String isRecorded, String fee, String discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("fee: "+fee);
        System.out.println("discount: "+discount);
    }
}
public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse p1 = new PaidOnlineCourse("Maths", "6 Months","Youtube", "Yes", "999", "10%");
        p1.displayDetails();
    }
}
