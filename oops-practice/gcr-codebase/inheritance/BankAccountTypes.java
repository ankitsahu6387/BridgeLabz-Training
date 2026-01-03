class BankAccount {
    String accountNumber;
    String balance;
    public BankAccount(String accountNumber, String balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    String interestRate;
    public SavingsAccount(String accountNumber, String balance, String interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType(){
        System.out.println("Account type: Saving Account");
        System.out.println("Account Number: "+accountNumber );
        System.out.println("Balance: "+balance);
        System.out.println("Interest rate: "+interestRate);
    }
}

class CheckingAccount extends BankAccount {
    String withdrawalLimit;
    public CheckingAccount(String accountNumber, String balance, String withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType(){
        System.out.println("Account type: Checking Account");
        System.out.println("Account Number: "+accountNumber );
        System.out.println("Balance: "+balance);
        System.out.println("Withdrawal Limit: "+withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    String tenureYear;
    public FixedDepositAccount(String accountNumber, String balance, String tenureYear){
        super(accountNumber, balance);
        this.tenureYear = tenureYear;
    }
    void displayAccountType(){
        System.out.println("Account type: Fixed Deposit Account");
        System.out.println("Account Number: "+accountNumber );
        System.out.println("Balance: "+balance);
        System.out.println("Tenure Years: "+tenureYear );
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("123","100","3%");
        s1.displayAccountType();
    }
}
