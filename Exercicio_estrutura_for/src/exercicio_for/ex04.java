package exercicio_for;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe quantos pares de divisoes:");
		int n = sc.nextInt();
		int i = 0;
		for (i = 0; i < n; i++) {

			System.out.println("Digite os numeros que serão divididos");
			float a, b, result;
			
			a = sc.nextFloat();
			b = sc.nextFloat();
			
			if(b == 0) {
				System.out.println("Divisao impossível");
			}else {
			result = a / b;
			
			System.out.println(result);
			}
			
			
		}

		sc.close();

	}

}
