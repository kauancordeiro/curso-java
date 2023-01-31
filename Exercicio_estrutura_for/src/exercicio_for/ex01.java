package exercicio_for;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x = sc.nextInt();
		int i, impar;
		while (x<1 || x>1000) {
			System.out.println("Digite um valor maior ou igual a 1 e menor ou igual a 1000:");
			x = sc.nextInt();
		}
		for (i=0; i<=x; i++) {
			if (i % 2 != 0 ) {
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
