package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double raio;
		double resu;
		double pi;
		pi = 3.14159;
		raio = sc.nextDouble();
		
		resu = pi * (Math.pow(raio,2.0));
		
		System.out.printf("area = %.4f", resu);
		
		
		
		
		
		sc.close();

	}

}
