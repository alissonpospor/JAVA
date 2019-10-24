package entites_exercicios;

public class Empregado {
	//Objeto do exercicio 2.
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void acrescimoSalario(double porcentual) {
		porcentual = porcentual / 100;
		double acrecimo = (salarioBruto * porcentual) + salarioBruto;
		this.salarioBruto = acrecimo;
	}

	public String toString() {
		return "Empregado: " + nome + ", R$ " + salarioLiquido();
	}
}
