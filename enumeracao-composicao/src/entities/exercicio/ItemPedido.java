package entities.exercicio;

import entities.exercicio.Produto;

public class ItemPedido {
	private int quantidade;
	private double preco;

	public ItemPedido(int quantidade) {
		this.quantidade = quantidade;
	}

	public double subTotal(int quantidade) {
		return preco * quantidade;
	}
}
