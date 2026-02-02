import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Container Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

// Repeatable Annotation
@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@interface BugReport {
    String description();
}

// Apply Repeatable Annotation
class SoftwareModule {

    @BugReport(description = "NullPointerException on startup")
    @BugReport(description = "Memory leak in data processing")
    public void runModule() {
        System.out.println("Module running...");
    }
}

// Retrieve and Print Bug Reports
public class RepeatableAnnotation {

    public static void main(String[] args) {

        try {
            Method method = SoftwareModule.class.getMethod("runModule");

            BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

            for (BugReport bug : bugReports) {
                System.out.println("Bug: " + bug.description());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}