package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		Rent[] rent = new Rent[10];
		
		System.out.println("Quantos estudantes vao alugar quartos ?");
		
		int n = sc.nextInt();
		
		for (int i =0; i<n; i++) {
			System.out.println("RENT #" + (i+1) + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			rent[room] = new Rent(name, email);
			
			
				
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0;i<rent.length;i++) {
			
			if (rent[i] != null) {
			System.out.println(i + ": " + rent[i]);
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
