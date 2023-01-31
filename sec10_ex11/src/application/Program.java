package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados ?");
		int n = sc.nextInt();
		
		Alunos[] alunos = new Alunos[n];
		
		for (int i = 0; i<alunos.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			alunos[i] = new Alunos(name, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i<alunos.length; i++) {
			double media = alunos[i].getNota1() + alunos[i].getNota2() / 2;
			if ( media > 6.0) {
				System.out.println(alunos[i].getName());
			}
			
		}
		
		
		
		sc.close();

	}

}
