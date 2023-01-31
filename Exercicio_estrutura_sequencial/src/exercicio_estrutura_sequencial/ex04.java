package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner (System.in);
		
		
		int num_func, h_trab;
		double h_valor, salario;
		
		num_func = sc.nextInt();
		h_trab = sc.nextInt();
		h_valor = sc.nextDouble();
		
		salario = h_trab * h_valor;
	
		System.out.println("Number :" + num_func);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		
		
		sc.close();

	}

}
