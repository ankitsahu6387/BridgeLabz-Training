public class EmployeeBonus {

    static double[][] generateEmployees(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }
    static double[][] calculateNewSalary(double[][] employees) {
        int n = employees.length;
        double[][] result = new double[n][2];
        for (int i = 0; i < n; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];
            double bonus = salary * (years > 5 ? 0.05 : 0.02);
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }
    static void displaySummary(double[][] employees, double[][] newData) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("OldSalary  Years  Bonus   NewSalary");
        for (int i = 0; i < employees.length; i++) {
            double oldSalary = employees[i][0];
            double years = employees[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            sumOld += oldSalary;
            sumNew += newSalary;
            sumBonus += bonus;

            System.out.printf("%8.0f  %5.0f  %6.2f  %9.2f%n", oldSalary, years, bonus, newSalary);
        }
        System.out.printf("Total:    %8.0f        %6.2f  %9.2f%n", sumOld, sumBonus, sumNew);
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] employees = generateEmployees(n);
        double[][] newData = calculateNewSalary(employees);
        displaySummary(employees, newData);
    }
}
