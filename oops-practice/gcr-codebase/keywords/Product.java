public class Product {
    static double discount=10.0;
    final String productID;
    String productName;
    double productPrice;
    int quantity;

    public Product(String productID, String productName, double productPrice, int quantity){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    public void display(){
        if(this instanceof Product){
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Product Price: $" + productPrice);
            System.out.println("Product Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + (productPrice-(productPrice*discount)/100));
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("P001","Laptop", 1200.0,5);
        p1.display();
        Product p2 = new Product("P002","Smartphone", 800.0,10);
        p2.display();        
    }
}
