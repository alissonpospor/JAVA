package exercicios.entities;

public abstract class Contribuinte {
	private String nome;
	protected double rendaAnual;

	public Contribuinte() {

	}

	public Contribuinte(String nome, double rendimentoAnual) {
		this.nome = nome;
		this.rendaAnual = rendimentoAnual;
	}

	// getter and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract Double imposto();

}
