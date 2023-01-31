package exercicio_for;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		
		for(i=1; i<=n; i++) {
			
			if (n % i == 0) {
				
				System.out.println(i);
				
			}
		}
		
		
		
		
		sc.close();

	}

}
