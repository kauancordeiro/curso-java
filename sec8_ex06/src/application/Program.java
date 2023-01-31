package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price ? ");
		double price = sc.nextDouble();
		
		System.out.println("How many dollar will be bought ? ");
		double qntd = sc.nextDouble();
		
		
		double total = CurrencyConverter.calc(qntd, price);
		
		
		System.out.println("Amount to be paid in reais = " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		

	}

}
