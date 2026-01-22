import java.time.LocalDate;
import java.util.*;
public class InsuranceApp {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy(101, "Alice",
                LocalDate.now().plusDays(10), "Health", 5000));

        manager.addPolicy(new Policy(102, "Bob",
                LocalDate.now().plusDays(40), "Auto", 7000));

        manager.addPolicy(new Policy(103, "Alice",
                LocalDate.now().plusDays(20), "Home", 6000));

        System.out.println("Get Policy 101:");
        System.out.println(manager.getPolicyByNumber(101));

        System.out.println("\nExpiring in 30 days:");
        manager.getExpiringSoonPolicies();

        System.out.println("\nPolicies for Alice:");
        manager.getPoliciesByHolder("Alice");

        manager.removeExpiredPolicies();

        System.out.println("\nAll Policies:");
        manager.displayAllPolicies();
    }
}
