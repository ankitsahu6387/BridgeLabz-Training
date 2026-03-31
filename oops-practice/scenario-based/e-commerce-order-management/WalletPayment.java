public class WalletPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0)
            throw new PaymentFailedException("Wallet payment failed");
        System.out.println("Paid $" + amount + " using Wallet");
    }
}
