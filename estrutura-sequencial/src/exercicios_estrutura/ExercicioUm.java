package exercicios_estrutura;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */

		Scanner teclado = new Scanner(System.in);

		// MÉTODO 1
		int num, num2;

		System.out.println("Digite o primeiro valor: ");
		num = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		num2 = teclado.nextInt();

		System.out.println(num + " + " + num2 + " = " + num + num2);

		/* MÉTODO 2 */
		int numero;
		System.out.println("Digite o primeiro número: ");
		numero = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		numero += teclado.nextInt();

		System.out.println("Resultado da soma: " + numero);

		teclado.close();
	}

}
