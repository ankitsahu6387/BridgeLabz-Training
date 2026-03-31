class Order{
    String orderId;
    String orderDate;
    public Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    void getOrderStatus(){
        System.out.println("Order Id: "+orderId);
        System.out.println("Order Date: "+orderDate);
    }
}
class ShippedOrder extends Order{
    String trackingNumber;
    public ShippedOrder(String orderId, String orderDate, String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number: "+trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
     void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date: "+deliveryDate);
    }
}
public class RetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder d1 = new DeliveredOrder("123","12-10=2025" ,"456" ,"12-11-2025");
        d1.getOrderStatus();
    }
}
