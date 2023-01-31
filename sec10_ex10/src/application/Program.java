package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pesosas voce vai digitar ? ");
		int n = sc.nextInt();
		
		Pessoas[] pessoas= new Pessoas[n];
		
		for (int i = 0; i<pessoas.length;i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			pessoas[i] = new Pessoas(name, age);
		}
		
		int posicaoMaior = 0;
		int maioridade = pessoas[posicaoMaior].getAge();
		
		for (int i = 0; i<pessoas.length;i++) {
			if (pessoas[i].getAge() > maioridade) {
				maioridade = pessoas[i].getAge();
				posicaoMaior ++;
				
				
			}
			
		}
		
		System.out.printf("Pessoa mais velha: %s\n", maioridade);
		

		sc.close();

	}

}
