package model.services;

public interface ServicoPagamentoOnline {

	double taxaPagamento(double valor);

	double interesse(double valor, int meses);
	
}
