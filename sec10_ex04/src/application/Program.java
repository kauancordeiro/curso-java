package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			double num = sc.nextDouble();
			vect[i] = num;
		}
		System.out.print("Valores: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}

		System.out.printf("\nSoma: %.2f\n", sum);

		double avg = sum / vect.length;
		System.out.printf("Media: %.2f\n", avg);

		sc.close();

	}

}
