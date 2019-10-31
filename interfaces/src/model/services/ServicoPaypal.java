package model.services;

public class ServicoPaypal implements ServicoPagamentoOnline {

	private static final double PORCENTAGEM_TAXA = 0.02;
	private static final double JUROS_MENSAIS = 0.01;

	@Override
	public double taxaPagamento(double valor) {
		// TODO Auto-generated method stub
		return valor * PORCENTAGEM_TAXA;
	}

	@Override
	public double interesse(double valor, int meses) {
		// TODO Auto-generated method stub
		return valor * JUROS_MENSAIS * meses;
	}

}
