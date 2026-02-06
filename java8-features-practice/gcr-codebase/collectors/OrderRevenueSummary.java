import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customerName;
    double orderTotal;

    Order(String customerName, double orderTotal) {
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }
}
public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Ankit", 2500.0),
            new Order("Rahul", 1800.0),
            new Order("Ankit", 3200.0),
            new Order("Priya", 1500.0),
            new Order("Rahul", 2200.0)
        );
        Map<String, Double> revenuePerCustomer =
                orders.stream()
                      .collect(Collectors.groupingBy(
                          o -> o.customerName,
                          Collectors.summingDouble(o -> o.orderTotal)
                      ));

        revenuePerCustomer.forEach((customer, total) ->
            System.out.println(customer + " : " + total)
        );
    }
}
