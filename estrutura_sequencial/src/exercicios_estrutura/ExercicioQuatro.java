package exercicios_estrutura;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
		 * casas decimais.
		 */

		int id, horasTrabalhadas;
		double valorHoras;

		id = teclado.nextInt();
		horasTrabalhadas = teclado.nextInt();
		valorHoras = teclado.nextDouble();

		System.out.println("Id: " + id);
		System.out.println("Sal�rio: R$ " + (valorHoras * horasTrabalhadas));
		
		teclado.close();
	}

}
