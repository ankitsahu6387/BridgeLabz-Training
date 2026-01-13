public class Main {
    public static void main(String[] args) {

        try {
            User u1 = new User(1, "Ankit");
            User u2 = new User(2, "Rahul");

            Wallet w1 = new Wallet(u1);
            Wallet w2 = new Wallet(u2);

            WalletService service = new WalletService();

            w1.addMoney(5000);
            service.recordTransaction(new Transaction("Add Money", 5000));

            TransferService transfer = new WalletTransfer();
            transfer.transfer(w1, w2, 2000);
            service.recordTransaction(new Transaction("Wallet Transfer", 2000));

            System.out.println("Ankit Balance: " + w1.getBalance());
            System.out.println("Rahul Balance: " + w2.getBalance());

            service.showTransactions();

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
