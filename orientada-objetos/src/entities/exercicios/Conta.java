package entities.exercicios;

public class Conta {
	//OBEJTO DO EXERCICIO 5
	private int numeroConta;
	private String nome;
	private double saldo;

	// Construtor
	public Conta() {

	}

	// sobrecarga de construtor
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	// sobrecarga de construtor
	public Conta(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	// fun��o que adiciona saldo na conta "DEPOSITO"
	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}

	// Fun��o que remove saldo da conta "SAQUE"
	public void debitoSaldo(double debito) {
		this.saldo -= debito;
	}

	// geters and seters.
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPoupanca() {
		return saldo;
	}
	// fim geters and seter

	// Mascara do toString()
	public String toString() {
		return "Conta: " + numeroConta + ", Nome:" + nome + ", Balan�o: R$ " + saldo;

	}

}
