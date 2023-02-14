package entities;



public class OrderItem {
	private Integer quantity;
	private Double price;
	
	
	
	
	public OrderItem() {
		
	}


	public OrderItem(Integer quatity, Double price) {

		this.quantity = quatity;
		this.price = price;
	}


	public Integer getQuatity() {
		return quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setQuatity(Integer quatity) {
		this.quantity = quatity;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return price * quantity;
		
	}
	

}
