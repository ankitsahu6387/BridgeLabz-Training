import java.util.*;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.println(itemName + " " + price + " " + quantity);
    }
}
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }
    public String getDiscountDetails() {
        return "10% Discount";
    }
}
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }
    public String getDiscountDetails() {
        return "5% Discount";
    }
}
public class OnlineFoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Burger", 120, 2));
        order.add(new NonVegItem("Chicken Pizza", 300, 1));
        double finalAmount = 0;
        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                total -= d.applyDiscount();
            }
            finalAmount += total;
        }
        System.out.println(finalAmount);
    }
}
