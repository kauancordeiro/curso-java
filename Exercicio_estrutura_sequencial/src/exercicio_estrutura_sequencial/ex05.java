package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1, peca2, num_peca1, num_peca2;
		float valor_peca1, valor_peca2, valor_final;

		System.out.println("Digite o código da peca 1:");
		peca1 = sc.nextInt();
		System.out.println("Quantas pecas 1:");
		num_peca1 = sc.nextInt();
		System.out.println("Valor unitário de cada peca 1:");
		valor_peca1 = sc.nextFloat();
		
		System.out.println("Digite o código da peca 2:");
		peca2 = sc.nextInt();
		System.out.println("Quantas pecas 2:");
		num_peca2 = sc.nextInt();
		System.out.println("Valor unitário de cada peca 2:");
		valor_peca2 = sc.nextFloat();
		
		valor_final = num_peca1 * valor_peca1 + num_peca2 * valor_peca2;
		
		System.out.printf("Valor a pagar: %.2f ", valor_final);
		
		
		
		
		
		sc.close();

	}

}
