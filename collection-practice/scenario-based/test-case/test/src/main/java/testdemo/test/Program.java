package testdemo.test;

public class Program {
	private double balance;
	public Program(double initialBalance) {
		this.balance = initialBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void Deposit(double amount){
		if(amount<0) {
			throw new IllegalArgumentException("Deposit amount cannot be negative");
		}
		balance += amount;
	}
	public void Withdraw(double amount) {
		if(amount>balance) {
			throw new IllegalArgumentException("Insufficient balance");
		}
		balance -= amount;
	}
}
