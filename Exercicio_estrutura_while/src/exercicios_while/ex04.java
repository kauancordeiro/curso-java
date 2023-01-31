package exercicios_while;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pref, alcool = 0, gasolina = 0,diesel= 0;
		
		
		pref = sc.nextInt();
		
		while (pref != 4) {
			if (pref == 1) {
				alcool ++;
			}
			else if (pref == 2) {
				gasolina ++;
			}
			else if (pref == 3){
				diesel ++;
			}
			pref = sc.nextInt();
		}
		
		
		System.out.println("Muito Obrigado");
		System.out.printf("Alcool:%d", alcool);
		System.out.printf("%nGasolina:%d", gasolina);
		System.out.printf("%nDiesel:%d", diesel);
		
		
		
		sc.close();

	}

}
