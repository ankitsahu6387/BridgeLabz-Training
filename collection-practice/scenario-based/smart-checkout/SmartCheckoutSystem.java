import java.util.*;

public class SmartCheckoutSystem {
    private Map<String, Item> inventory = new HashMap<>();
    private List<CheckoutCounter> counters = new ArrayList<>();

    public void addItem(String name, double price, int stock) {
        inventory.put(name, new Item(name, price, stock));
    }

    public void addCounter() {
        counters.add(new CheckoutCounter(inventory));
    }

    public CheckoutCounter getCounter(int index) {
        return counters.get(index);
    }

    public void displayStock() {
        System.out.println("Current stock:");
        for (Item item : inventory.values()) {
            System.out.println(item.name + " - " + item.stock + " units");
        }
    }
}
