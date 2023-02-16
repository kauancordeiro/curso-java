package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	SimpleDateFormat sdf = new SimpleDateFormat("hh/MM/yyyy hh:MM:ss");
	
	
	List<OrderItem> items = new ArrayList<>();
	
	private Client client;
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	
	public Double total() {
		double total = 0.0;
		for (OrderItem item : items) {
			total += item.subTotal();
		}
		
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append(client);
		sb.append("Order Items: \n");
		
		for (OrderItem items : items) {
			sb.append(items);
			
		}
		sb.append("Total price: ");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
		
	}
	
	
	
	
	
	
	

}
