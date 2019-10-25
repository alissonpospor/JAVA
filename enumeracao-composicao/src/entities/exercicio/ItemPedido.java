package entities.exercicio;

import java.util.ArrayList;
import java.util.List;

import entities.exercicio.Produto;

public class ItemPedido {
	private int quantidade;
	private double preco;

	public ItemPedido(int quantidade) {
		this.quantidade = quantidade;
	}

	public double subTotal(int quantia) {
		return preco * quantia;
	}
}
