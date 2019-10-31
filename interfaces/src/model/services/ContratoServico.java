package model.services;

import model.entities.Contrato;

public class ContratoServico extends Contrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;

	private Contrato contra = new Contrato();

	// contrutor
	public ContratoServico(ServicoPagamentoOnline servico) {
		this.servicoPagamentoOnline = servico;
	}

	public void processoDeContrato(Contrato cont, int meses) {
		cont.getData();
	}
}
