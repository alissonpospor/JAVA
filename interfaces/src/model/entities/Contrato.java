package model.entities;

import java.util.Date;

public class Contrato {
	private int numero;
	private Date data;
	private Double valorTotal;

	public Contrato() {

	}

	public Contrato(int numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	// geters and seters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Contrato [numero=" + numero + ", data=" + data + ", valorTotal=" + valorTotal + "]";
	}

}
