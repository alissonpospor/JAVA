package exercicios.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produtoo {
	private Date dataFabricacao;
	private final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String precoEtiqueta() {
		return "Produdo: (usado)" + nome + ", Preço: " + preco + ", Data de Fabricação: "
				+ formatoData.format(dataFabricacao);
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	// getters and setters

}
