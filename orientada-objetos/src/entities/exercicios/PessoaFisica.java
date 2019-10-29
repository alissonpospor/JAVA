package entities.exercicios;

public class PessoaFisica extends Contribuinte {
	private double gastosSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, double rendimentoAnual, double gastosSaude) {
		super(nome, rendimentoAnual);
		this.gastosSaude = gastosSaude;
	}

	// getter and setters
	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		if (getRendaAnual() < 20.000) {
			return getRendaAnual() * 0.15 - gastosSaude * 0.5;
		} else {
			return getRendaAnual() * 0.25 - gastosSaude * 0.5;
		}
	}

}
