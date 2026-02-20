import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatterUtil {

    // Static method to format date
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}