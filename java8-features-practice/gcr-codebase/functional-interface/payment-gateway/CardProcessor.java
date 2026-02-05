class CardProcessor implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}