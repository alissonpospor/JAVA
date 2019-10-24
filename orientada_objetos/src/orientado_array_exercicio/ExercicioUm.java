package orientado_array_exercicio;

import java.util.Scanner;

import entites_exercicios.Quarto;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Instanciando o objeto quartos em um array
		Quarto[] quartos = new Quarto[10];

		System.out.println("Número de quartos a serem alugados?");
		int quantidade = teclado.nextInt();

		// for criado para coletar as informações a ser SEtados nos quartos
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Alugador #" + i);

			System.out.print("Nome: ");
			String nome = teclado.next();

			teclado.nextLine();
			System.out.print("E-mail: ");
			String email = teclado.nextLine();

			System.out.print("Quarto escolhido [0 - 9]: ");
			int quarto = teclado.nextInt();

			// Enviando os valores coletados nas variaveis anteriores e instanciandos estes
			// valores nos objetos.
			quartos[quarto] = new Quarto(nome, email, quarto);
		}

		// Printar no console os quartos
		System.out.println("_______________________");
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i].toString());
			}
		}
		teclado.close();
	}

}
