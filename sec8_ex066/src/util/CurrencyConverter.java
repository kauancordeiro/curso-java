package util;

public class CurrencyConverter {

	public static double calc(double valor, double qntd) {
		return (qntd * valor) + (valor * (qntd * 6/100));
		
		
	}
	
}
