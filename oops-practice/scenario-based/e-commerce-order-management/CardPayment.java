public class CardPayment implements Payment{
    public void pay(double amount) throws PaymentFailedException{
        if(amount<=0) throw new PaymentFailedException("Card payment failed");
        System.out.println("Paid $"+amount+" usind card");
    }   
}
