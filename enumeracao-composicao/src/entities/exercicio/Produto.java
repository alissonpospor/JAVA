package entities.exercicio;

public class Produto {
	private String nomeProd;
	private Double preco;

	public Produto(String nomeProd, Double preco) {
		this.nomeProd = nomeProd;
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

}
