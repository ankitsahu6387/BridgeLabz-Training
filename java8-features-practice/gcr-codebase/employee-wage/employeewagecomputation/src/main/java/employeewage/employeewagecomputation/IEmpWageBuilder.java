package employeewage.employeewagecomputation;

public interface IEmpWageBuilder {

    void addCompany(String name, int wagePerHour,
                    int maxDays, int maxHours);

    void computeWages();

    int getTotalWage(String companyName);
}
