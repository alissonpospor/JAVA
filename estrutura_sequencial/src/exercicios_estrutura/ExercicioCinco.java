package exercicios_estrutura;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
		 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
		 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */
		Scanner teclado = new Scanner(System.in);

		int id, id2, quantidade, quantidade2;
		double valorPeca, valorPeca2;

		System.out.println("Pe�a 1: ");
		id = teclado.nextInt();
		quantidade = teclado.nextInt();
		valorPeca = teclado.nextDouble();
		System.out.println("Pe�a 2: ");
		id2 = teclado.nextInt();
		quantidade2 = teclado.nextInt();
		valorPeca2 = teclado.nextDouble();

		System.out.println("Valor a pagar: R$ " + ((quantidade * valorPeca) + (quantidade2 * valorPeca2)));
		teclado.close();
	}

}
