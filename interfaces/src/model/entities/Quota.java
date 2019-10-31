package model.entities;

import java.util.Date;

public class Quota extends Contrato {
	private Date dataVencimento;
	private double montante;

	public Quota() {
		// TODO Auto-generated constructor stub
	}

	public Quota(Date dataVencimento, double montante) {
		this.dataVencimento = dataVencimento;
		this.montante = montante;
	}

	// geters and seters
	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

}
