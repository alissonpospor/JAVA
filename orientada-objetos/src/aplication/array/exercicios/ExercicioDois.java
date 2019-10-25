package aplication.array.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.exercicios.Empregado;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Criando a array list, to TIPO do meu objeto
		List<Empregado> empregado = new ArrayList<>();

		System.out.print("Quantos empregados serão registrado? ");
		int quantidade = teclado.nextInt();

		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Empregado: #" + i);
			System.out.print("Id: ");
			int id = teclado.nextInt();

			System.out.print("Nome: ");
			String nome = teclado.next();
			teclado.nextLine();

			System.out.print("Salário: ");
			double salario = teclado.nextDouble();

			empregado.add(new Empregado(id, nome, salario));
		}

		System.out.println("Id do empregado que terá o salário Aumentado: ");
		int id = teclado.nextInt();
		// Foreach para buscar na Lista de Arrays qual o objeto "Empregado" que terá o
		// id igual o usuario escolher
		for (Empregado auxiliar : empregado) {
			if (auxiliar.getId() == id) {
				System.out.println("Porcentagem do salário para ser aumentada?");
				auxiliar.aumentoSalario(teclado.nextInt());
				;
			}

		}

		System.out.println("lista de empregados: ");
		for (Empregado auxiliar : empregado) {
			System.out.println(auxiliar);
		}

		teclado.close();
	}

}
