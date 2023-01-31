package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int i;
		double q,c;
		
		for (i=1; i<=n; i++) {
			
			q = Math.pow(i, 2);
			c = Math.pow(i, 3);
			
			System.out.printf("%d %.0f %.0f%n", i, q, c);
			
			
			
			
			
			
		}
		
		
		
		
		
		sc.close();
	}

}
