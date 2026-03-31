import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SmartCheckoutSystem system = new SmartCheckoutSystem();

        // Add items to inventory
        system.addItem("Milk", 2.5, 10);
        system.addItem("Bread", 1.5, 5);
        system.addItem("Eggs", 0.5, 20);

        // Add one checkout counter
        system.addCounter();
        CheckoutCounter counter = system.getCounter(0);

        // Add customers
        counter.addCustomer(new Customer("Alice", Arrays.asList("Milk", "Bread")));
        counter.addCustomer(new Customer("Bob", Arrays.asList("Eggs", "Milk", "Bread")));
        counter.addCustomer(new Customer("Charlie", Arrays.asList("Eggs", "Eggs", "Milk")));

        // Process customers
        counter.processNextCustomer();
        counter.processNextCustomer();
        counter.processNextCustomer();

        // Display remaining stock
        system.displayStock();
    }
}
