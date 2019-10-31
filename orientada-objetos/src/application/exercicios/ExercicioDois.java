package application.exercicios;

import java.util.Scanner;

import exercicios.entities.Funcionario;

public class ExercicioDois {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e
		 * imposto). Em seguida, mostrar os dados do funcion�rio (nome e sal�rio
		 * l�quido). Em seguida, aumentar o sal�rio do funcion�rio com base em uma
		 * porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) e
		 * mostrar novamente os dados do funcion�rio. Use a classe projetada abaixo.
		 */
		Scanner teclado = new Scanner(System.in);
		Funcionario empregado = new Funcionario();

		System.out.println("Digite seus dados:");
		System.out.print("Nome: ");
		empregado.nome = teclado.nextLine();
		System.out.print("Sal�rio Bruto: ");
		empregado.salarioBruto = teclado.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = teclado.nextDouble();

		System.out.println("Empregado: " + empregado);

		System.out.print("Qual porcentagem de acrescimo no sal�rio? ");
		double c = teclado.nextDouble();
		empregado.acrescimoSalario(c);

		System.out.println("Att: " + empregado);

		teclado.close();
	}

}
