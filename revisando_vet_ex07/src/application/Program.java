package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("QUantos numeros voce vai digitar ? ");
		int n = sc.nextInt();
		
		
		double[] vect = new double[n];
		double maior = 0.0;
		int posi = 0;
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
			if (vect[i] > maior) {
				maior = vect[i];
				posi = i;
				
			}
	
		}
		
		System.out.printf("Maior valor = %.2f", maior);
		System.out.printf("\nPosicao do maior valor = %d", posi);
		
		
	
		
		
		
		
		
		
		
		sc.close();

	}

}
