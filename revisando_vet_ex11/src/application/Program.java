package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		int olderAge = 0;
		String older = "";
		
		Pessoas[] pessoa = new Pessoas[n];
		
		for(int i = 0; i<pessoa.length;i++) {
			
			System.out.println("Dados da " + (i+1)+ "a pessoa: ");
			
			System.out.printf("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.printf("Idade: ");
			Integer age = sc.nextInt();
			
			pessoa[i] = new Pessoas(name, age);
			
			if (pessoa[i].getAge() > olderAge) {
				olderAge = pessoa[i].getAge();
				older = pessoa[i].getName();
			}
			
			
		}
		
		System.out.printf("Pessoa mais velha: %s", older);
		
		
		
		
		
		sc.close();

	}

}
