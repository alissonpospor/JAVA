package exercicios_estrutura;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

		int id, horasTrabalhadas;
		double valorHoras;

		id = teclado.nextInt();
		horasTrabalhadas = teclado.nextInt();
		valorHoras = teclado.nextDouble();

		System.out.println("Id: " + id);
		System.out.println("Salário: R$ " + (valorHoras * horasTrabalhadas));
		
		teclado.close();
	}

}
