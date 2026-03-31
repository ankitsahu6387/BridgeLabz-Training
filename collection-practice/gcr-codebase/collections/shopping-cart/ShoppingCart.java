import java.util.*;

public class ShoppingCart {

    // Product -> Price (fast lookup)
    private Map<String, Integer> priceMap = new HashMap<>();

    // Product -> Quantity (maintains add order)
    private Map<String, Integer> cartMap = new LinkedHashMap<>();

    // Add product with price
    public void addProduct(String product, int price) {
        priceMap.put(product, price);
    }

    // Add item to cart
    public void addToCart(String product, int quantity) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + quantity);
    }

    // Display cart in insertion order
    public void displayCart() {
        System.out.println("Cart (Insertion Order):");
        cartMap.forEach((p, q) ->
                System.out.println(p + " x " + q + " = " + priceMap.get(p) * q));
    }

    // Display items sorted by price
    public void displaySortedByPrice() {

        TreeMap<Integer, List<String>> sorted = new TreeMap<>();

        for (String product : cartMap.keySet()) {
            int price = priceMap.get(product);
            sorted.putIfAbsent(price, new ArrayList<>());
            sorted.get(price).add(product);
        }

        System.out.println("Cart (Sorted by Price):");
        sorted.forEach((price, products) ->
                System.out.println(price + " -> " + products));
    }
}
