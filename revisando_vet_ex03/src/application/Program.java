package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Quantos numeros voce vai digitar ?");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for( int i = 0; i<vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = sc.nextInt();
			while (vect[i] > 10) {
				System.out.print("Digite um número menor ou igual a 10: ");
				vect[i] = sc.nextInt();
			}
		}
		
		for (int i =0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		sc.close();
	}

}
