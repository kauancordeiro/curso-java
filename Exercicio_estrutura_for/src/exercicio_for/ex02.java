package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos numeros sera lido:");
		int n = sc.nextInt();
		int i, fora = 0, dentro = 0;

		for (i = 0; i < n; i++) {
			
			int valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println(dentro + " in");
		System.out.println(fora + " out");

		sc.close();

	}

}
