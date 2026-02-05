class WalletProcessor implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Wallet");
    }

    // Custom refund logic
    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed to Wallet");
    }
}