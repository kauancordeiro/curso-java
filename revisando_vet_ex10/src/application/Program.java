package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		
		double[] vect = new double[n];
		double pares = 0.0;
		int qntdPares = 0;
		
		for ( int i = 0; i<vect.length; i++) {
			
			
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
			
			if(vect[i] % 2 == 0) {
				pares += vect[i];
				qntdPares++;
				
			}
			
		}
		
		if(qntdPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
		double avgPares = pares/qntdPares;
		
		System.out.printf("Media dos pares = %.1f", avgPares);
		}
		
		
		
		
		
		
		sc.close();

	}

}
