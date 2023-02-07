package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos numeros voce vai digitar ?");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double sum = 0.0;
		for (int i = 0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		System.out.printf("Valores = ");

		for (int i = 0; i<vect.length; i++) {
			 System.out.printf(vect[i] + " ");
		}
		System.out.printf("\nSoma = %.2f\n", sum);
		
		double avg = sum/n;
		
		System.out.printf("Media = %.2f", avg);
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
