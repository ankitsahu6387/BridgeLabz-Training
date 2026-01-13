public class Order {
    private Product product;
    private Customer customer;
    private boolean isCancelled = false;
    public Order(Product product, Customer customer){
        this.product = product;
        this.customer = customer;
    }
    public void placeOrder(Payment payment){
        try{
            payment.pay(product.getPrice());
            System.out.println("Order placed for "+product.getName());
        } catch(PaymentFailedException e){
            System.out.println(e.getMessage());
        }
    } 
    public void cancelOrder(){
        isCancelled = true;
        System.out.println("Order cancelled");
    }
    public void trackOrder(){
        if(isCancelled) System.out.println("Order cancelled");
        else System.out.println("Order is out for delivery");
    }
}
