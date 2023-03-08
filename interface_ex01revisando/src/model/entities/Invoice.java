package model.entities;

public class Invoice {
	
	private Double basicPayment;
	private double tax;
	
	
	public Invoice() {
		
	}


	public Invoice(Double basicPayment, double tax) {
		
		this.basicPayment = basicPayment;
		this.tax = tax;
	}


	public Double getBasicPayment() {
		return basicPayment;
	}


	public double getTax() {
		return tax;
	}


	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}

	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
	

}
