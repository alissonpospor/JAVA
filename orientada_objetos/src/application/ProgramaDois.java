package application;

import java.util.Scanner;

import util.Calculadora;

public class ProgramaDois {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre o RAIO: ");
		double raio = teclado.nextDouble();

		double c = Calculadora.circunferencia(raio);

		double v = Calculadora.volume(raio);

		System.out.println("Circunferência: " + c);
		System.out.println("Volume: " + v);
		System.out.println("Valor de PI: " + Calculadora.PI);

		teclado.close();
	}
}
