package exercicio;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// string representado como %s
		String product1 = "Computer";
		String product2 = "Office Desk";

		// int representado como %d
		int age = 30;
		int code = 5290;

		// char é %s
		char gender = 'F';

		// double representado como %f
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products:%n%s, wich price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f%n", product2, price2);
		System.out.printf("%nRecord:%d years old, code %d and gender:%s%n", age, code, gender);
		System.out.printf("%nMeasure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places):%.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point:%.3f%n", measure);
		
		
		double a;
		int b;
		a = 5.9999;
		b = (int) a;
		
		System.out.println(b);

	}

}
