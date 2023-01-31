package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price ?");
		double valor = sc.nextDouble();
		
		System.out.println("Quantos dollars ? ");
		double qntd = sc.nextDouble();
		
		double total = CurrencyConverter.calc(valor, qntd);
		
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
