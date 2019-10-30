package model.entities;

import model.exceptions.Excecoes;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private double saqueLimite;

	public Conta() {

	}

	public Conta(int numero, String titular, double saldo, double saqueLimite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.saqueLimite = saqueLimite;
	}

	// geter and seter
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaqueLimite() {
		return saqueLimite;
	}

	public void setSaqueLimite(double saqueLimite) {
		this.saqueLimite = saqueLimite;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	// inicio funçoes
	public void saque(double valor) {
		if (valor > saqueLimite) {
			throw new Excecoes("Valor digitado excede o saque limite!");
		}
		if (valor > saldo) {
			throw new Excecoes("Sem Saldo na conta!");
		}
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", saqueLimite=" + saqueLimite
				+ "]";
	}

}
