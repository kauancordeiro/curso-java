package exercicios_condicional;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a;
		
		System.out.println("Informe um número inteiro:");
		a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		
		
		sc.close();

	}

}
