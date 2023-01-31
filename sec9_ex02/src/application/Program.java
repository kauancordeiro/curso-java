package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Enter account number : ");
		int number = sc.nextInt();
		System.out.println("Enter account holder : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n) ? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, name, initialDeposit);
		}else {
			conta = new Conta(number, name);
		}
		
		
		
		
		System.out.println(conta.toString());
		
		System.out.println("Enter a deposit value : ");
		double saldo = sc.nextDouble();
		conta.addSaldo(saldo);
	
		System.out.println(conta.toString());
		
		
		
		System.out.println("Enter a withdraw value : ");
		saldo = sc.nextDouble();
		conta.removeSaldo(saldo);
		
		System.out.println(conta.toString());
		
		
		sc.close();

	}

}
