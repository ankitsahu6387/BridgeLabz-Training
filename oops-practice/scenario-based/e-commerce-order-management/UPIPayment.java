public class UPIPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0)
            throw new PaymentFailedException("UPI payment failed");
        System.out.println("Paid $" + amount + " using UPI");
    }
}