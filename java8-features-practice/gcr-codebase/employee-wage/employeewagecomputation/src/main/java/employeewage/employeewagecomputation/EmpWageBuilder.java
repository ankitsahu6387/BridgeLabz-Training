package employeewage.employeewagecomputation;

import java.util.*;

public class EmpWageBuilder implements IEmpWageBuilder {

    private List<CompanyEmpWage> companyList = new ArrayList<>();

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    @Override
    public void addCompany(String name, int wagePerHour,
                           int maxDays, int maxHours) {

        companyList.add(new CompanyEmpWage(name, wagePerHour, maxDays, maxHours));
    }

    @Override
    public void computeWages() {

        for (CompanyEmpWage company : companyList) {

            int totalHours = 0;
            int totalDays = 0;
            int totalWage = 0;

            Random random = new Random();

            while (totalHours < company.getMaxWorkingHours()
                    && totalDays < company.getMaxWorkingDays()) {

                totalDays++;

                int empCheck = random.nextInt(3);
                int empHours = 0;

                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHours = 8;
                        break;
                    case IS_PART_TIME:
                        empHours = 4;
                        break;
                    default:
                        empHours = 0;
                }

                totalHours += empHours;

                int dailyWage = empHours * company.getWagePerHour();
                company.addDailyWage(dailyWage);

                totalWage += dailyWage;
            }

            company.setTotalWage(totalWage);
        }
    }

    @Override
    public int getTotalWage(String companyName) {

        return companyList.stream()
                .filter(c -> c.getCompanyName().equalsIgnoreCase(companyName))
                .map(CompanyEmpWage::getTotalWage)
                .findFirst()
                .orElse(0);
    }
}
