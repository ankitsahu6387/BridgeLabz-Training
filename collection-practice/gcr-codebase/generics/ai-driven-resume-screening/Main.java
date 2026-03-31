import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>("Ankit Sahu", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Rahul Sharma", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Neha Verma", new ProductManager());
        ResumeScreeningUtil.screenResume(seResume);
        ResumeScreeningUtil.screenResume(dsResume);
        ResumeScreeningUtil.screenResume(pmResume);
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());
        ResumeScreeningUtil.processRoles(roles);
    }
}
