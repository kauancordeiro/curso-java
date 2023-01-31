package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce quer digitar? ");
		int n = sc.nextInt();

		int[] pares = new int[n];
		int qntd = 0;
		for (int i = 0; i < pares.length; i++) {
			System.out.print("Digite um numero: ");
			pares[i] = sc.nextInt();

		}
		System.out.println("\nNumeros pares: ");
		for (int i = 0; i < pares.length; i++) {
			if (pares[i] % 2 == 0) {
				qntd++;
				System.out.print(pares[i] + " ");
			}

		}
		System.out.println("\nQuantidade de pares: " + qntd);

		sc.close();

	}

}
