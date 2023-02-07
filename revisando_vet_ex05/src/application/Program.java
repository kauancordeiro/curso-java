package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas pessoas serao digitadas ?");
		
		int n = sc.nextInt();
		
		
	
		Pessoas[] pessoa = new Pessoas[n];
		
		double heightTotal = 0.0;
		
		for(int i = 0; i<pessoa.length; i++) {
		System.out.printf("Dados da " + (i+1)+ "a pessoa: \n");	
		System.out.printf("Nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.printf("Idade: ");
		int age = sc.nextInt();
		
		System.out.printf("Altura: ");
		double height = sc.nextDouble();
		pessoa[i] = new Pessoas(name, age, height);
		
		heightTotal += pessoa[i].getHeight();
		
		}
		
		double avg = heightTotal/n;
		
		System.out.printf("Altura media: %.2f\n", avg);
		int menos = 0;
		for(int i = 0; i<pessoa.length; i++) {
			if (pessoa[i].getAge() < 16) {
				menos++;
			}
			
		}
		double percent = (menos * 100)/ n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent);
		
		
		
		
		for(int j = 0; j<pessoa.length; j++) {
			if (pessoa[j].getAge()<16) {
				System.out.println(pessoa[j].getName());
			}
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
	}

}
