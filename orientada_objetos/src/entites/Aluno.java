package entites;

public class Aluno {
	// Objeto do exercicio 3.
	public String nome;
	public double nota;
	public double nota2;
	public double nota3;

	public double notaFinal() {
		return nota + nota2 + nota3;
	}

	public double notasPerdidas() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
}
