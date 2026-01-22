import java.time.LocalDate;

public class Policy implements Comparable<Policy> {

    private int policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(int policyNumber, String policyHolderName,
                  LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    // Unique policy based on policyNumber
    @Override
    public boolean equals(Object obj) {
        Policy p = (Policy) obj;
        return this.policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return policyNumber;
    }

    // Sorting by expiry date for TreeSet
    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName +
               " | " + coverageType + " | " + expiryDate;
    }
}
