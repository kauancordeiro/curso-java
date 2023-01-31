package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, pi, area_tri, area_cir, area_trap, area_quad, area_ret;
		System.out.println("Valor de A: ");
		a = sc.nextDouble();
		System.out.println("Valor de B: ");
		b = sc.nextDouble();
		System.out.println("Valor de C: ");
		c = sc.nextDouble();
		pi = 3.14159;
		
		area_tri = (a * c)/2;
		System.out.printf("Triangulo: %.3f %n", area_tri);
		
		area_cir = pi * (Math.pow(c,2.0));
		System.out.printf("Circulo: %.3f %n", area_cir);
		
		area_trap = (a + b) * c /2;
		System.out.printf("Trapezio: %.3f %n", area_trap);
		
		area_quad = (Math.pow(b,2.0));
		System.out.printf("Quadrado: %.3f %n", area_quad);
		
		area_ret = a * b;
		System.out.printf("Retangulo: %.3f %n", area_ret);
		
		

	}

}
