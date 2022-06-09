package Fixacao73secao8;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double valorReais(double dollar, double compra) {
		return dollar * compra * (1.0 + IOF);
	}
		


	
	}

