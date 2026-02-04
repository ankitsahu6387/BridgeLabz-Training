import java.util.*;
import java.util.function.Function;

class Invoice {
    int transactionId;
    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }
    void printInvoice() {
        System.out.println("Invoice created for Transaction ID: " + transactionId);
    }
}
public class InvoiceApp {
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(101, 102, 103);
        // Constructor reference
        Function<Integer, Invoice> invoiceCreator = Invoice::new;
        for (int id : transactionIds) {
            Invoice invoice = invoiceCreator.apply(id);
            invoice.printInvoice();
        }
    }
}