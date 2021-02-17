package entities;

public class Account {

	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	
	public Account(String accountHolder, int accountNumber, double value) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		balance = value;
	}
	
	public Account(String accountHolder, int accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5;
	}
	
	public String toString() {
		
		return "Account " + 
		accountNumber + 
		", Holder: " + 
		accountHolder + 
		", Balance: $ " + 
		String.format("%.2f%n", balance);
	}

}
