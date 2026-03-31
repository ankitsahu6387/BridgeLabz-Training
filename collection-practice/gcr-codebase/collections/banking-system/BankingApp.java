public class BankingApp {
    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        bank.addAccount(101, 5000);
        bank.addAccount(102, 2000);
        bank.addAccount(103, 8000);

        bank.requestWithdrawal(101);
        bank.requestWithdrawal(102);

        bank.processWithdrawals(3000);
        bank.displaySortedByBalance();
    }
}
