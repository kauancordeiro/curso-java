package exercicios_while;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha:");
		
		int senha = sc.nextInt();
	
		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
			
		}
		System.out.println("Acesso permitido");
		
		
		sc.close();
		

	}

}
