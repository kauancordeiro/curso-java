package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe qual o tamanho do vetor");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		
		
		for (int i = 0; i<n; i++) {
			System.out.print("Informe o valor do" + (i+1) + " Vetor: ");
			vect[i] = sc.nextDouble();
			
		}
		double sum = 0.0;
		
		for(int i = 0; i<n; i++) {
		sum += vect[i];
		}
		double averageHeight = sum/n;
		
		System.out.println("Total: " + sum);
		System.out.printf("Average Height: %.2f",  averageHeight);
		
		
		
		
		
		sc.close();
	}

}
