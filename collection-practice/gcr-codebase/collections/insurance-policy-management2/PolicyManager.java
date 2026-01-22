import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    // Fast lookup by policy number
    private Map<Integer, Policy> hashMap = new HashMap<>();

    // Maintains insertion order
    private Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();

    // Sorted by expiry date
    private Map<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy policy) {

        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);

        treeMap.putIfAbsent(policy.getExpiryDate(), new ArrayList<>());
        treeMap.get(policy.getExpiryDate()).add(policy);
    }

    // 1️⃣ Retrieve policy by number
    public Policy getPolicyByNumber(int policyNumber) {
        return hashMap.get(policyNumber);
    }

    // 2️⃣ Policies expiring in next 30 days
    public void getExpiringSoonPolicies() {

        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.entrySet()) {
            if (!entry.getKey().isAfter(limit)) {
                entry.getValue().forEach(System.out::println);
            }
        }
    }

    // 3️⃣ Policies for a specific policyholder
    public void getPoliciesByHolder(String name) {

        for (Policy p : hashMap.values()) {
            if (p.getPolicyHolderName().equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // 4️⃣ Remove expired policies
    public void removeExpiredPolicies() {

        LocalDate today = LocalDate.now();

        hashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));
        linkedHashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));

        treeMap.entrySet().removeIf(e -> e.getKey().isBefore(today));
    }

    // Display all (in insertion order)
    public void displayAllPolicies() {
        linkedHashMap.values().forEach(System.out::println);
    }
}
