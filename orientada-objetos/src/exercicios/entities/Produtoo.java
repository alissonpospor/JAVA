package exercicios.entities;

public class Produtoo {
	protected String nome;
	protected double preco;

	public Produtoo(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String precoEtiqueta() {
		return "Produdo: " + nome + ", Preço: " + preco;
	}

	// Getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
