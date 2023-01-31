package exercicio_for;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero para cacular seu fatorial");
		int n = sc.nextInt();
		int fat = 1;
		int i = 1;
		for (i = 1; i <= n; i++) {
			
			fat = fat * i;
		}

		System.out.println(fat);

		sc.close();

	}

}
