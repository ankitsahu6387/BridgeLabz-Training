import java.util.*;

public class CheckoutCounter {
    private Queue<Customer> queue = new LinkedList<>();
    private Map<String, Item> inventory;

    public CheckoutCounter(Map<String, Item> inventory) {
        this.inventory = inventory;
    }

    public void addCustomer(Customer c) {
        queue.offer(c);
        System.out.println("Customer " + c.name + " added to the queue.");
    }

    public void processNextCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in the queue.");
            return;
        }

        Customer c = queue.poll();
        double total = 0;

        System.out.println("Processing customer: " + c.name);

        for (String itemName : c.shoppingList) {
            Item item = inventory.get(itemName);
            if (item == null || item.stock <= 0) {
                System.out.println("Item " + itemName + " is out of stock!");
                continue;
            }
            total += item.price;
            item.stock--; // update stock
        }

        System.out.println("Total bill for " + c.name + ": $" + total);
        System.out.println("-----");
    }
}
