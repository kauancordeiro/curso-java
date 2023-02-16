package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh/MM/yyyy");
		
		
		
		System.out.println("Enter cliente data:");
		System.out.printf("Name: ");
		String name = sc.nextLine();
		System.out.printf("Email: ");
		String email = sc.nextLine();
		System.out.printf("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name,email,birthDate);
		
		System.out.println("Enter order data:");
		System.out.printf("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		
		Order order = new Order(new Date(), status, client);
		
		
		System.out.printf("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n ; i++) {
			System.out.println("Enter #"+ (i+1)+ " item data:");
			System.out.printf("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			
			System.out.printf("Product price: ");
			Double prodPrice = sc.nextDouble();
			
			System.out.printf("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(prodName, prodPrice);
			
			OrderItem items = new OrderItem(quantity, prodPrice, product);
			
			order.addItem(items);
			
		}
		
		System.out.println(order);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
