package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar ? ");
		int n = sc.nextInt();
		while (n > 10) {
			System.out.println("Maximo de 10 numeros, digite novamente: ");
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		System.out.println("Digite os numeros: ");
		for (int i =0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i=0; i<n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
