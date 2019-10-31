package application.exercicios;

import java.util.Scanner;

import exercicios.entities.Funcionario;

public class ExercicioDois {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
		 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
		 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
		 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
		 * mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
		 */
		Scanner teclado = new Scanner(System.in);
		Funcionario empregado = new Funcionario();

		System.out.println("Digite seus dados:");
		System.out.print("Nome: ");
		empregado.nome = teclado.nextLine();
		System.out.print("Salário Bruto: ");
		empregado.salarioBruto = teclado.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = teclado.nextDouble();

		System.out.println("Empregado: " + empregado);

		System.out.print("Qual porcentagem de acrescimo no salário? ");
		double c = teclado.nextDouble();
		empregado.acrescimoSalario(c);

		System.out.println("Att: " + empregado);

		teclado.close();
	}

}
