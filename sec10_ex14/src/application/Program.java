package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];
		
		System.out.println("Quantos quartos serao alugados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.printf("Aluguel #%d\n", i+1);
			System.out.println("Nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int room = sc.nextInt();
			
			aluguel[room] = new Aluguel(name,email,room);
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i<10; i++) {
			if(aluguel[i] != null) {
			System.out.println(aluguel[i].toString());	
			}
			
		}
		
		
		
		
		
		
		sc.close();

	}

}
