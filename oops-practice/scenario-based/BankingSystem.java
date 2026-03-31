import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

interface BankService {
    void deposit(double amount);

    void withdraw(double amount) throws InsufficientBalanceException;

    double checkBalance();
}

abstract class Account implements BankService {
    int accountNumber;
    String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to " + accountHolder + "'s account.");
    }

    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from " + accountHolder + "'s account.");

        } else {
            throw new InsufficientBalanceException("Insufficient balance in " + accountHolder + "'s account.");
        }
    }

    public double checkBalance() {
        return balance;
    }
    public abstract double calculateInterest();
}
class SavingsAccount extends Account{
    double interestRate = 0.04;
    public SavingsAccount(int accountNumber, String accountHolder, double initialBalance){
        super(accountNumber, accountHolder, initialBalance);
    }
    public double calculateInterest(){
        return balance*interestRate;
    }
}
class CurrentAccount extends Account{
    double interestRate = 0.02;
    public CurrentAccount(int accountNumber, String accountHolder, double initialBalance){
        super(accountNumber, accountHolder, initialBalance);
    }
    public double calculateInterest(){
        return balance*interestRate;
    }
}
class Transaction{
    String type;
    double amount;
    public Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }
}
class Bank{
    List<Account> accounts = new ArrayList<>();
    Map<Integer, List<Transaction>> transactionHistory = new HashMap<>();
    public void addAccount(Account account){
        accounts.add(account);
        transactionHistory.put(account.accountNumber, new ArrayList<>());
        System.out.println("Account created for " + account.accountHolder);
    }
    public Account geAccount(int accountNumber){
        for(Account acc: accounts){
            if(acc.accountNumber == accountNumber) return acc;
        }
        return null;
    }
    public void transferFunds(Account from, Account to, double amount){
        synchronized(this){
            try{
                from.withdraw(amount);
                to.deposit(amount);
                transactionHistory.get(from.accountNumber).add(new Transaction("Transfer Out", amount));
                transactionHistory.get(to.accountNumber).add(new Transaction("Transfer In", amount));
                System.out.println("Transfer $"+amount+" from "+from.accountHolder+" to "+ to.accountHolder);
            } catch (InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void showTransactionHistory(int accountNumber){
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for(Transaction t: transactionHistory.get(accountNumber)){
            System.out.println(t.type+" - $"+t.amount);
        }
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account acc1 = new SavingsAccount(101, "Ankit", 5000);
        Account acc2 = new CurrentAccount(102, "Keerti", 3000);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        // Simulate transactions using threads
        Thread t1 = new Thread(() -> {
            acc1.deposit(2000);
            try { acc1.withdraw(1000); } catch (InsufficientBalanceException e) { System.out.println(e.getMessage()); }
        });
        Thread t2 = new Thread(() -> {
            bank.transferFunds(acc1, acc2, 1500);
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Balance:");
        System.out.println(acc1.accountHolder + ": $" + acc1.checkBalance());
        System.out.println(acc2.accountHolder + ": $" + acc2.checkBalance());
        bank.showTransactionHistory(acc1.accountNumber);
        bank.showTransactionHistory(acc2.accountNumber);
    }
}
