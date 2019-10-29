package entities.exercicios;

public class PessoaJuridica extends Contribuinte {
	private int numeroEmpregados;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome, double rendimentoAnual, int numeroEmpregados) {
		super(nome, rendimentoAnual);
		this.numeroEmpregados = numeroEmpregados;
	}

	// get and seters
	public int getNumeroEmpregados() {
		return numeroEmpregados;
	}

	public void setNumeroEmpregados(int numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}

	@Override
	public Double imposto() {
		if (numeroEmpregados > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}

}