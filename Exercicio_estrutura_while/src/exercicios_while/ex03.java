package exercicios_while;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pref, a = 0, g = 0, d = 0;

		pref = sc.nextInt();

		while (pref != 4) {
			switch (pref) {
			case 1:
				a ++;
				break;
			case 2:
				g ++;
				break;
			case 3:
				d ++;
				break;
			}

				pref = sc.nextInt();

		}
		System.out.println("Muito Obrigado");
		System.out.printf("Alcool:%d", a);
		System.out.printf("%nGasolina:%d", g);
		System.out.printf("%nDiesel:%d", d);

		sc.close();

	}

}
