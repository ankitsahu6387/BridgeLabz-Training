import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();    
}
abstract class Product implements Taxable{
    private int productId;
    private String name;
    private double price;
    Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    abstract double calculateDiscount();
    void displayDetails(){
        System.out.println("Product Id" +productId + " Name: " + name + " Price: " + price);
    }
}
class Electronics extends Product{
    Electronics(int id, String name, double price){
        super(id, name, price);
    }
    @Override
    double calculateDiscount(){
        return getPrice() * 0.10;
    }
    @Override
    public double calculateTax(){
        return getPrice() * 0.18;
    }
    @Override
    public String getTaxDetails(){
        return "Electronic Tax: 18%";
    }
}
class Clothing extends Product {
    Clothing(int id, String name, double price) { super(id, name, price); }

    @Override
    double calculateDiscount() { return getPrice() * 0.20; }

    @Override
    public double calculateTax() { return getPrice() * 0.05; }

    @Override
    public String getTaxDetails() { return "Clothing Tax: 5%"; }
}
class Groceries extends Product {
    Groceries(int id, String name, double price) { super(id, name, price); }

    @Override
    double calculateDiscount() { return 0; }

    @Override
    public double calculateTax() { return 0; }

    @Override
    public String getTaxDetails() { return "No Tax"; }
}

public class ECommercePlatform {
    static void calculateFinalPrice(List<Product> products){
        for(Product p: products){
            double finalPrice = p.getPrice()+p.calculateTax()-p.calculateDiscount();
            System.out.println(p.getName() + " -> Price: " + p.getPrice()
                    + ", Discount: " + p.calculateDiscount()
                    + ", Tax: " + p.calculateTax()
                    + ", Final Price: " + finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "T-Shirt", 1000));
        products.add(new Groceries(103, "Rice", 200));

        calculateFinalPrice(products);        
    }
}
