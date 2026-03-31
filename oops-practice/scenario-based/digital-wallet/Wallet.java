public class Wallet {
    private User user;
    private double balance;

    public Wallet(User user) {
        this.user = user;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
    }

    public User getUser() {
        return user;
    }
}
