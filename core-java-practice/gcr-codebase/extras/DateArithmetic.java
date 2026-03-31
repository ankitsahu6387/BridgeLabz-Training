import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (YYYY-MM-DD): ");
        String input = sc.nextLine();   // safer than next()
        sc.close();
        LocalDate date = LocalDate.parse(input);
        LocalDate result = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);
        System.out.println("Final Date: " + result);
    }
}
