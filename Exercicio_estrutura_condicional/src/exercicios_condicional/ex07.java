package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;
		System.out.println("Insira o valor de X e Y do plano cartesiano:");
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x == 0 && y > 0) {
			System.out.println("EIXO Y");
		} else if (y == 0 && x > 0) {
			System.out.println("EIXO X");
		} else {
			System.out.println("Origem");
		}

		sc.close();

	}

}
