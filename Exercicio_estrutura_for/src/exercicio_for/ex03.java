package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Defina quantos casos serao");
		int caso = sc.nextInt();
		float i, a1, a2, a3, result;
		for (i = 0; i < caso; i++) {
			
			
			System.out.println("Digite três valores com uma casa decimal:");
			a1 = sc.nextFloat();
			a2 = sc.nextFloat();
			a3 = sc.nextFloat();

			result = (a1 * 2 + a2 * 3 + a3 * 5) / 10;
			

			System.out.printf("%.1f%n",result);
			
		}

		sc.close();

	}

}
