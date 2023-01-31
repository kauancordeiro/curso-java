package entities;

public class Conta {
	
	private int number;
	private String name;
	private double saldo;
	
	
	
	
	
	public Conta(int number, String name) {
		 
		this.number = number;
		this.name = name;
	}

	public Conta(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		addSaldo(initialDeposit);
	}

	public int getNumber() {
		return number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

public void addSaldo (double saldo) {
	this.saldo += saldo;
}

public void removeSaldo (double saldo) {
	this.saldo -= saldo + 5;
}


public String toString() {
	return "Account data : \nAccount : " + number 
			+ ", Holder : " 
			+ name 
			+ ", Balance : $" 
			+ String.format("%.2f", saldo)
			+"\n";

}
	
	
	
	
	
	

}
