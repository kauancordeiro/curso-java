package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double vect[] = new double[n];
		double pares = 0;
		double qntd = 0;
		for (int i = 0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i=0; i<vect.length; i++){
			
			if(vect.length % 2 == 0) {
				pares += vect[i];
				qntd ++;
				
			}
		}
		
		if (qntd == 0) {
			System.out.println("Nenhum numero par");
		} else {
			pares = pares / n;
			System.out.printf("Media dos pares: %.1f", pares);
		}
		
		
		
		
		sc.close();


	}

}
