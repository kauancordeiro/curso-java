package exercicios_condicional;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, tempo;

		System.out.println("Insira a hora inicial e final de um jogo:");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a < b) {

			tempo = b - a ;
		} else {
			tempo = 24 - a + b;

		}
		
		System.out.printf("O jogo durou %d Hora(s)", tempo);

		sc.close();
	}

}
