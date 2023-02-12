package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Pessoas;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner (System.in);
	
	
	System.out.printf("Quantas pessoas serao digitadas ? ");
	int n =sc.nextInt();
	
	Pessoas[] pessoa = new Pessoas[n];
	
	double menor = 100.0;
	double maior = 0.0;

	int maleCount = 0;
	int femaleCount = 0;
	double totalFemale = 0.0;
	
	
	
	for(int i = 0; i<pessoa.length; i++) {
		
		System.out.printf("Altura da " + (i+1) + "a pessoa: ");
		
		double height = sc.nextDouble();
		
		System.out.printf("Genero da " + (i+1) +"a pessoa: ");
		
		char gen = sc.next().charAt(0);
		
		pessoa[i] = new Pessoas(height, gen);
		
		if (pessoa[i].getHeight() > maior) {
			maior = pessoa[i].getHeight();
		}
		
		if (pessoa[i].getGen() == 'M') {
			maleCount ++;
			
		}else {
			femaleCount ++;
			totalFemale += pessoa[i].getHeight();
			
		}
	
		
	}
	
	
	for (int i =0; i<pessoa.length;i++) {
		
		
		if(pessoa[i].getHeight() < menor ) {
			menor = pessoa[i].getHeight();
		}
	}
	
	double avgFemale = totalFemale / femaleCount;
	
	System.out.printf("Menor altura = %.2f%n", menor);
	System.out.printf("Maior altura: %.2f%n", maior);
	System.out.printf("Media das alturas das mulheres: %.2f%n", avgFemale);
	System.out.printf("Numero de homens: %d%n", maleCount);
	
	
	
	
	
	sc.close();

	}

}
