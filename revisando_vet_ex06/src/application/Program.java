package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numero voce vai digitar ? ");
		int n = sc.nextInt();
		
		
		int[] vect = new int[n];
		
		for (int i = 0;i<vect.length;i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int pares = 0;
		System.out.println("Numeros pares: ");
		for(int i = 0; i<vect.length; i++) {
			if (vect[i] % 2 == 0)
			{
				System.out.printf(vect[i] + " ");
				pares++;
			}
			
		}
		
		System.out.printf("\nQuantidade de pares = %d", pares);
		
		
		
		
		sc.close();

	}

}
