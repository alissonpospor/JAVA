package entities.exercicios;

public class Empregado {
//OBJETO DA CLASSE EXERCICIO SEIS QUE ESTA NO PACKAGE aplication_exericios/ExercicioSeis
	private int id;
	private String nome;
	private double salario;

	public Empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	// Função para realizar o aumento do salário
	public void aumentoSalario(double aumento) {
		aumento = aumento / 100;
		this.salario += salario * aumento;
	}

	// Getter -> pega o id do objeto
	public int getId() {
		return id;
	}

	// sobrecarga de toString
	public String toString() {
		return "id: " + id + ", Nome: " + nome + ", Salario: " + salario;
	}
}
