package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double renda, valor;
		
		System.out.println("Insira o valor de sua renda mensal:");
		renda = sc.nextDouble();
		
		if (renda < 2000) {
			System.out.println("ISENTO de imposto");
		}else if (renda <= 3000) {
			
			valor = (renda - 2000) * 0.08;
			
			
			System.out.printf("O valor do imposto a ser pago: %.2f", valor);
			
		}else if (renda <= 4500) {
			
			valor = 1000 * 0.08 + ((renda - 3000) * 0.18);
					
		
			System.out.printf("O valor do imposto a ser pago: %.2f", valor);
			
		}else {
			
			valor = 1000 * 0.08 + 1500 * 0.18 + ((renda - 4500) * 0.28);
			
					
			System.out.printf("O valor do imposto a ser pago: %.2f", valor);
			
		}
		
		
		
		sc.close();

	}

}
