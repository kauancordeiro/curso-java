package exercicio_while;

import java.util.Scanner;

public class aula01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		// Estrutura repetitiva "enquanto"
		// recomendada quando não se sabe previamente a quantidade
		// de repetições
		// REGRA: V: Executa e volta, F: pula fora.
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
			
		}
		System.out.println(soma);
		
		
		sc.close();

	}

}
