public class Main {
    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", 60000);
        Customer c = new Customer(101 ,"Ankit");
        Order order = new Order(p, c);
        Payment payment = new UPIPayment();
        order.placeOrder(payment);
        order.trackOrder();
        order.cancelOrder();
    }    
}
