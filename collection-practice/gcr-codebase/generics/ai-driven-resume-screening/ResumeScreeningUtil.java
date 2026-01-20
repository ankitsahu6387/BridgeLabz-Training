import java.util.List;

public class ResumeScreeningUtil {

    // Generic method
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println(resume.getResumeDetails());
        System.out.println("Required Skills: " +
                resume.getJobRole().getRequiredSkills());
        System.out.println("Status: Sent for AI Evaluation\n");
    }

    // Wildcard method
    public static void processRoles(List<? extends JobRole> roles) {
        System.out.println("---- Screening Pipeline Roles ----");
        for (JobRole role : roles) {
            System.out.println(role.getRoleName());
        }
    }
}
