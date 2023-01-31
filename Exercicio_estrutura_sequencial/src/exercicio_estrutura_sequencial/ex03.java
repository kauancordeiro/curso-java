package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, r;
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		r = a * b - c * d;
		
		System.out.println(r);

		
		sc.close();
	}

}
