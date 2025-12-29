public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int totalDays = 0;
        int totalHours = 0;
        int totalWage = 0;
        while (totalDays < 20 && totalHours < 100) {
            totalDays++;
            int empCheck = (int)(Math.random() * 3);
            int hours = 0;
            switch (empCheck) {
                case 1:
                    hours = fullDayHour;
                    break;
                case 2:
                    hours = partTimeHour;
                    break;
                default:
                    hours = 0;
            }
            totalHours += hours;
            totalWage += hours * wagePerHour;
            System.out.println("Day " + totalDays + " | Hours Worked: " + hours);
        }
        System.out.println("\nTotal Days: " + totalDays);
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Wage: ₹" + totalWage);
    }
}
