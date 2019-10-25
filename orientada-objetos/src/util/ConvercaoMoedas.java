package util;

public class ConvercaoMoedas {

	public static final double IOF = 0.06;

	public static double calculaDolar(double precoDolar, double quantidade) {

		return quantidade * precoDolar * (1.0 + IOF);
	}
}
