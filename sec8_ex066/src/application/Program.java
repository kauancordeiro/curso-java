package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual e a cotacao do dolar ?");
		double valor = sc.nextDouble();
		
		System.out.println("Quantos dolares deseja comprar ?");
		double qntd = sc.nextDouble();
		
		double total = CurrencyConverter.calc(valor, qntd);
		
		
		System.out.println(total);
		
		
		
		
		
		sc.close();

	}

}
