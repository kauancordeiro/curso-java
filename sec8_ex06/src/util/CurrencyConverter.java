package util;

public class CurrencyConverter {

	public static double calc(double qntd, double preco) {

		return qntd * preco + (preco * (qntd * 6 / 100));

	}

}
