public class WalletService {

    private Transaction[] transactions = new Transaction[10];
    private int count = 0;

    public void recordTransaction(Transaction tx) {
        transactions[count++] = tx;
    }

    public void showTransactions() {
        System.out.println("---- Transaction History ----");
        for (int i = 0; i < count; i++) {
            System.out.println(transactions[i].getDetails());
        }
    }
}
