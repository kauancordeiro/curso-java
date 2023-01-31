package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo;
		double qntd, total;

		System.out.println("Insira o codigo e a quantidade do item:");
		codigo = sc.nextInt();
		qntd = sc.nextFloat();

		if (codigo == 1) {
			total = qntd * 4;
			System.out.println("Valor total: " + total);

		} else if (codigo == 2) {
			total = qntd * 4.50;
			System.out.println("Valor total: " + total);

		} else if (codigo == 3) {
			total = qntd * 5;
			System.out.println("Valor total: " + total);

		} else if (codigo == 4) {
			total = qntd * 2;
			System.out.println("Valor total: " + total);

		} else if (codigo == 5) {
			total = qntd * 1;
			System.out.println("Valor total: " + total);

		} else {
			System.out.println("CÓDIGO INVÁLIDO, TENTE NOVAMENTE!!");
		}

		sc.close();

	}

}
