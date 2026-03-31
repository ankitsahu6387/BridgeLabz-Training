class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize account
    BankAccount(String holder, String number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
        displayBalance();
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("State of Chennai", "12345", 700);

        account.displayBalance();       // Initial balance
        account.deposit(200);           // Deposit 200
        account.withdraw(100);          // Withdraw 100
        account.withdraw(1000);         // Attempt to withdraw more than balance
    }
}
