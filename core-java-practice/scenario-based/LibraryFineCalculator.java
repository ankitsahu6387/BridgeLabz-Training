import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Book " + i + ":");
            System.out.print("Enter due date (yyyy-MM-dd): ");
            LocalDate dueDate = LocalDate.parse(sc.next(), format);
            System.out.print("Enter return date (yyyy-MM-dd): ");
            LocalDate returnDate = LocalDate.parse(sc.next(), format);
            long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
            int fine = (daysLate > 0) ? (int)(daysLate * finePerDay) : 0;
            System.out.println("Fine for Book " + i + ": ₹" + fine + "\n");
        }
        sc.close();
        System.out.println("All books processed.");
    }
}
