package application.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.exercicio.Cliente;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat dat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite os dados do cliente:");
		System.out.print("Nome: ");
		String nome = teclado.nextLine();

		System.out.print("E-mail: ");
		String email = teclado.nextLine();

		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		String aniversario = teclado.nextLine();// coleta a data do aniversario em String.

		Date data = dat.parse(aniversario);// converte a data coletada do tipo String para DAte.
		dat.format(data);// Formata a data para melhor atender.
		Cliente cliente = new Cliente(nome, email, data);// Manda os dados do CLIENTE para a classe CLIENTE.

		System.out.print("Quantos itens deseja comprar? ");
		int quantidade = teclado.nextInt();
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Entre com o" + i + "# item:");
			System.out.print("Nome do Produto: ");
			String prod = teclado.nextLine();

			System.out.print("Preço: ");
			double preco = teclado.nextDouble();

			System.out.print("Quantidade: ");
			int qtdade = teclado.nextInt();

		}
	}

}
