package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double tax = 5;
	
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
		
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit (double valueDeposit) {
		balance += valueDeposit;
	}
	
	public void withdraw (double valueWithdraw) {
		balance -= valueWithdraw + tax;
	}
	
	public String toString() {
		return "Account " + number +", " + "Holder: " + holder + ", Balance: $" + String.format("%.2f \n",balance); 
	}
	
	

}
