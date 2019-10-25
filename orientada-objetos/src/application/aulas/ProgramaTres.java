package application.aulas;

import java.util.Scanner;

import entities.Produto;

public class ProgramaTres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o produto: ");
		System.out.print("Nome: ");
		String name = teclado.nextLine();

		System.out.print("Preço: ");
		double price = teclado.nextDouble();

		System.out.print("Quantidade em estoque: ");
		int quantity = teclado.nextInt();
		Produto produto = new Produto(name, price, quantity);

		System.out.println();
		System.out.println("Dados produto:: " + produto);
		System.out.println();

		System.out.print("Número deste produto para ser adicionado ao estoque: ");
		quantity = teclado.nextInt();

		produto.addProducts(quantity);

		System.out.println();
		System.out.println("Dados produto: " + produto);
		System.out.println();
		System.out.print("Número deste produto para ser removido do estoque: ");

		quantity = teclado.nextInt();

		produto.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados produto: " + produto);

		teclado.close();
	}

}
