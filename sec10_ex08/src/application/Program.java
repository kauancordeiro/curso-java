package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double vect[] = new double[n];
		double total = 0;
		for (int i = 0; i<vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			total += vect[i];
		}
		
		total = total / n;
		
		System.out.printf("Media do vetor = %.3f\n", total);
		
		System.out.println("Elementos abaixo da media: ");
		
		for (int i = 0; i<vect.length; i++) {
			
			if (vect[i] < total) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
