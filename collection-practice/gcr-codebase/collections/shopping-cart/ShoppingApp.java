public class ShoppingApp {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 50000);
        cart.addProduct("Mouse", 500);
        cart.addProduct("Keyboard", 1500);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Mouse", 2);
        cart.addToCart("Keyboard", 1);

        cart.displayCart();
        cart.displaySortedByPrice();
    }
}
