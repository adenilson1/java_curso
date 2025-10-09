package util;

public class CurrencyConverter {
	
	public static double converter(double princeDollar, double real) {
		return princeDollar * real + princeDollar * real * 6/100;
	}

}
