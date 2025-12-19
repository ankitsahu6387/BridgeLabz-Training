import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();
        double bonus;
        if (yearsOfService > 5) {
            bonus = salary * 5 / 100.0;
        } else {
            bonus = 0;
        }
        System.out.println("The employee's bonus is: " + bonus);
        scanner.close();
    }
}
