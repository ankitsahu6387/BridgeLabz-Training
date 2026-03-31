import java.util.*;
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid withdraw or insufficient balance");
        }
    }
    public abstract double calculateInterest();
}
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Savings Account " + getAccountNumber());
        } else {
            System.out.println("Loan not approved for Savings Account " + getAccountNumber());
        }
    }
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 1000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public double calculateInterest() {
        return 0;
    }
    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Current Account " + getAccountNumber());
        } else {
            System.out.println("Loan not approved for Current Account " + getAccountNumber());
        }
    }
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() + overdraftLimit >= 5000; // example eligibility condition
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV123", "Alice", 2000, 4));
        accounts.add(new CurrentAccount("CUR456", "Bob", 3000, 2000));
        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getAccountNumber() + " Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
                loanAcc.applyForLoan(1000);
            }
            System.out.println();
        }
        accounts.get(0).deposit(500);
        accounts.get(1).withdraw(1000);
    }
}
