package entites;

public class Conta {
	private int numeroConta;
	private String nome;
	private double saldo;

	// Construtor
	public Conta() {

	}

	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public Conta(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	// funçoes
	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}

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

	public void setPoupanca(double poupanca) {
		this.saldo = poupanca;
	}
	// fim geters and seter

	// Mascara do toString()
	public String toString() {
		return "Conta: " + numeroConta + ", Nome:" + nome + ", Balanço: R$ " + saldo;

	}

}
