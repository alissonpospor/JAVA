package aplication.exercicios;

import java.util.Scanner;

import entites.exercicios.Conta;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com os dados da conta:");
		System.out.print("Número da conta:");
		int numConta = teclado.nextInt();

		System.out.print("Nome:");
		String nome = teclado.next();
		Conta conta = new Conta(numConta, nome);

		System.out.println("Deseja fazer o primeiro deposito agora? [1- SIM; 2- NÃO]");
		if (teclado.nextInt() == 1) {
			System.out.println("Qual o valor?");
			conta.addSaldo(teclado.nextDouble());
		}

		System.out.println("Conta criada com sucesso!");
		System.out.println("Dados: " + conta.toString());

		int resposta = 0;
		do {
			System.out.println("Deseja fazer alguma operação? [1- Deposito; 2- Sacar; 3- Mudar nome, 0 - SAIR]");
			resposta = teclado.nextInt();
			// Switch case para mandar para a operação correta
			switch (resposta) {
			case 1:
				System.out.println("Qual valor a depositar?");
				conta.addSaldo(teclado.nextDouble());
				break;
			case 2:
				System.out.println("Valor de saque?");
				conta.debitoSaldo(teclado.nextDouble());
				break;
			case 3:
				System.out.println("Qual o novo nome?");
				conta.setNome(teclado.next());
				break;
			default:
				break;
			}
			System.out.println("Dados: " + conta.toString());

		} while (resposta != 0);

		teclado.close();
	}

}
