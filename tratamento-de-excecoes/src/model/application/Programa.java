package model.application;

import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.Excecoes;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com os dados da conta:");
		System.out.print("Número: ");
		int numero = teclado.nextInt();

		System.out.print("Titular:  ");
		teclado.nextLine();
		String titular = teclado.nextLine();

		System.out.print("Saldo inicial: ");
		double saldo = teclado.nextDouble();

		System.out.print("Limite do saque:");
		double saqueLimite = teclado.nextDouble();
		Conta conta = new Conta(numero, titular, saldo, saqueLimite);// adicionando os valores ao objeto de Conta

		System.out.println();
		System.out.println("Antes:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Quantidade para o saque:");
		double saque = teclado.nextDouble();
		conta.saque(saque);

		try {
			conta.saque(saque);
			System.out.println("Novo saldo: " + conta.getSaldo());
		} catch (Excecoes e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		teclado.close();
	}
}
