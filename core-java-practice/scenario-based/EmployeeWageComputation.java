public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        calculateMonthlyWage();
    }
    static void calculateMonthlyWage() {
        int totalDays = 0;
        int totalHours = 0;
        int totalWage = 0;
        while (totalDays < MAX_WORKING_DAYS && totalHours < MAX_WORKING_HOURS) {
            totalDays++;
            int workHours = getWorkingHours();
            totalHours += workHours;
            totalWage += workHours * WAGE_PER_HOUR;
            System.out.println("Day " + totalDays + " | Hours Worked: " + workHours + " | Daily Wage: ₹" + (workHours * WAGE_PER_HOUR));
        }
        System.out.println("\nTotal Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Employee Wage: ₹" + totalWage);
    }
    static int getWorkingHours() {
        int empCheck = (int) (Math.random() * 3);
        switch (empCheck) {
            case 1: return FULL_TIME_HOURS;
            case 2: return PART_TIME_HOURS;
            default: return 0;
        }
    }
}
