import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateFormatterUtil.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateFormatterUtil.formatDate(invoiceDate, "yyyy/MM/dd");
        String format3 = DateFormatterUtil.formatDate(invoiceDate, "dd MMM yyyy");

        System.out.println("Invoice Date (dd-MM-yyyy): " + format1);
        System.out.println("Invoice Date (yyyy/MM/dd): " + format2);
        System.out.println("Invoice Date (dd MMM yyyy): " + format3);
    }
}