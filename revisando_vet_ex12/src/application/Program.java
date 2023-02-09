package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Pessoas[] pessoa = new Pessoas[n];
		
		for (int i =0; i<pessoa.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno");
			
			sc.nextLine();
			String nome = sc.nextLine();
			double notaA =sc.nextDouble();
			double notaB = sc.nextDouble();
			pessoa[i] = new Pessoas(nome, notaA, notaB);
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i<pessoa.length; i++) {
			if (pessoa[i].media() >= 6.0) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
