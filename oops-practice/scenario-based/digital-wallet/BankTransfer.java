public class BankTransfer implements TransferService {

    @Override
    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException {

        double bankFee = 10;
        from.withdrawMoney(amount + bankFee);
        to.addMoney(amount);
        System.out.println("Bank transfer successful (₹10 fee applied)");
    }
}
