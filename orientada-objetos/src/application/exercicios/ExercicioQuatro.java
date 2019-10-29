package application.exercicios;

import java.util.Scanner;

import util.ConvercaoMoedas;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Qual o preço do dolar? ");
		double precoDolar = teclado.nextDouble();

		System.out.print("Quantos dolars quer comprar? ");
		double valorCompra = teclado.nextDouble();

		System.out.println("Quanto vai pagar em reais: " + ConvercaoMoedas.calculaDolar(precoDolar, valorCompra));
		teclado.close();
	}

}
