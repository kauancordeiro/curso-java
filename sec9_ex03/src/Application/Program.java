package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			conta = new Account(number, holder,deposit);
		} else {
			conta = new Account(number, holder);
		}
		
		System.out.println(conta.toString());
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta.deposit(deposit);
		
		System.out.println(conta.toString());
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta.withdraw(withdraw);
		
		System.out.println(conta.toString());
		
		
		
		
		
		
		
		sc.close();

	}

}
