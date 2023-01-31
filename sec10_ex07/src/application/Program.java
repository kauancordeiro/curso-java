package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor ?");
		int n = sc.nextInt();

		int[] vect = new int[n];
		int[] vect1 = new int[n];
		int vectFinal = 0;
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vect.length; i++) {

			vect[i] = sc.nextInt();

		}
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vect.length; i++) {

			vect1[i] = sc.nextInt();

		}
		System.out.println("Vetor resultante: ");
		for (int i = 0; i < vect.length; i++) {

			vectFinal = vect1[i] + vect[i];

			System.out.println(vectFinal);

		}

		sc.close();

	}

}
