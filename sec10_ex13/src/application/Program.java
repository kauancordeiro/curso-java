package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Usuarios;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Usuarios[] usuario = new Usuarios[n];

		for (int i = 0; i < usuario.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			
			char gen = sc.next().charAt(0);

			usuario[i] = new Usuarios(height, gen);

		}

		
		double highHeight = 0;
		double maisBaixo = 0;
		for (int i = 0; i < usuario.length; i++) {
			if (maisBaixo > usuario[i].getHeight()) {
				maisBaixo = usuario[i].getHeight();
				
			}
			if (highHeight < usuario[i].getHeight()) {
				highHeight = usuario[i].getHeight();
			}

		}
		System.out.printf("Menor altura = %.2f\n", maisBaixo);

		
		
		for (int i = 0; i < usuario.length; i++) {
			
		}
		System.out.printf("Maior altura = %.2f\n", highHeight);
		double totalW = 0;
		double mediaW = 0;
		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getGen() == 'F') {
				totalW += usuario[i].getHeight();
				mediaW++;
			}
		}
		mediaW = totalW / mediaW;

		System.out.printf("Media das alturas das mulheres: %.2f\n", mediaW);
		int totalM = 0;
		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getGen() == 'M') {
				totalM++;
			}
		}
		System.out.printf("Numero de homens = %d", totalM);

		sc.close();

	}

}
