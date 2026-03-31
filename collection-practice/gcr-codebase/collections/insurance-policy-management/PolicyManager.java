import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // All unique policies
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }

    // Policies expiring in next 30 days
    public void getExpiringSoonPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    // Policies by coverage type
    public void getPoliciesByCoverage(String type) {
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // Performance comparison
    public void performanceTest(Set<Policy> set, String name) {

        long start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            set.add(new Policy(i, "User",
                    LocalDate.now(), "Health", 5000));
        }

        set.contains(new Policy(5000, "", LocalDate.now(), "", 0));
        set.remove(new Policy(5000, "", LocalDate.now(), "", 0));

        long end = System.nanoTime();
        System.out.println(name + " Time: " + (end - start));
    }
}
