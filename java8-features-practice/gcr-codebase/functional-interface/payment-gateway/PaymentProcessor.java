interface PaymentProcessor {

    // Existing abstract method
    void pay(double amount);

    // New feature added later
    default void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed (default handling)");
    }
}