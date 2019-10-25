package exercicios_estrutura;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Scanner teclado = new Scanner(System.in);

		int id, id2, quantidade, quantidade2;
		double valorPeca, valorPeca2;

		System.out.println("Peça 1: ");
		id = teclado.nextInt();
		quantidade = teclado.nextInt();
		valorPeca = teclado.nextDouble();
		System.out.println("Peça 2: ");
		id2 = teclado.nextInt();
		quantidade2 = teclado.nextInt();
		valorPeca2 = teclado.nextDouble();

		System.out.println("Valor a pagar: R$ " + ((quantidade * valorPeca) + (quantidade2 * valorPeca2)));
		teclado.close();
	}

}
