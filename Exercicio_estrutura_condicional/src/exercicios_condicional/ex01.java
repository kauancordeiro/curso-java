package exercicios_condicional;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite um número inteiro");
		a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
