import java.time.LocalDate;
import java.util.*;

public class InsuranceApp {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy(101, "Alice",
                LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new Policy(102, "Bob",
                LocalDate.now().plusDays(40), "Auto", 7000));
        manager.addPolicy(new Policy(103, "Carol",
                LocalDate.now().plusDays(20), "Health", 6000));

        System.out.println("All Policies:");
        manager.displayAllPolicies();

        System.out.println("\nExpiring Soon:");
        manager.getExpiringSoonPolicies();

        System.out.println("\nHealth Policies:");
        manager.getPoliciesByCoverage("Health");

        manager.performanceTest(new HashSet<>(), "HashSet");
        manager.performanceTest(new LinkedHashSet<>(), "LinkedHashSet");
        manager.performanceTest(new TreeSet<>(), "TreeSet");
    }
}
