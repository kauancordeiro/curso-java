package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas ?");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %da pessoa: \n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			pessoa[i] = new Pessoa(name, age, height);

		}
		double sum = 0;
		for (int i = 0; i<pessoa.length; i++) {
			sum += pessoa[i].getHeight();
		}
		
		double avg = sum / pessoa.length;
		
		System.out.printf("Altura media: %.2f\n", avg);
		int menor = 0;
		for(int i = 0; i<pessoa.length; i++) {
			if (pessoa[i].getAge()<16) {
				menor += 1;
			}
		}
		
		int percentMenor = menor * 100 /pessoa.length;
		
		System.out.println("Pessoas com menos de 16 anos: " + percentMenor +"%");
		
		for(int i = 0; i<pessoa.length; i++) {
			if (pessoa[i].getAge()<16) {
				System.out.println(pessoa[i].getName());
			}
		}

		sc.close();

	}

}
