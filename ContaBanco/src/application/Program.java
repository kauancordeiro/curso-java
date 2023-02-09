package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaTerminal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.println("Informe a agencia: ");
		sc.nextLine();
		String agencia = sc.nextLine();
		
		System.out.println("Informe seu nome: ");
		
		String nome = sc.nextLine();
		
		System.out.println("Informe o seu saldo bancario: ");
		double saldo = sc.nextDouble();
		
		ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);
		
		System.out.println(conta);
		
		
		sc.close();
		}
		
		
		
		

}


