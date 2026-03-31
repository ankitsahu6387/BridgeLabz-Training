class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize cart item
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add items to cart
    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    // Method to remove items from cart
    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        } else {
            System.out.println("Cannot remove " + qty + ". Only " + quantity + " in cart.");
        }
    }

    // Method to display total cost
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total cost: $" + total);
    }

    // Method to display item details
    void displayItem() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 999.99, 1);

        item.displayItem();    // Show initial details
        item.addItem(2);       // Add 2 more
        item.removeItem(1);    // Remove 1
        item.displayTotalCost(); // Show total cost
    }
}
