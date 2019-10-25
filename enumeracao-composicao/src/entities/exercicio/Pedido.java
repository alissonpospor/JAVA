package entities.exercicio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.exercicio.Status;

public class Pedido {
	private Date momento;
	private Status status;
	private String cliente;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yyyy HH:mm:ss");

	private List<ItemPedido> item = new ArrayList<>();

	public Pedido(Date momento, Status status, String nome) {
		this.momento = momento;
		this.status = status;
		this.cliente = nome;
	}

	public static void adicionaItem() {
		item.add();
	}
}
