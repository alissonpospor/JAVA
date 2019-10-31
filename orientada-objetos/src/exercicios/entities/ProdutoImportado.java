package exercicios.entities;

public class ProdutoImportado extends Produtoo {
	private double taxaAlfandega;

	public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	@Override
	public String precoEtiqueta() {
		calculoTaxa();
		return "Produdo: " + nome + ", Pre�o: " + preco + ", Taxa Alf�ndega:" + taxaAlfandega;
	}

	public void calculoTaxa() {
		this.preco += taxaAlfandega;
	}

	// getters and setters
	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

}
