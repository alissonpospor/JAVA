package entites.exercicios;

//CLASSE DO EXERCICIO DE ARRAY COM OBJETOS
public class Quarto {
	private String nome;
	private String email;
	private int quarto;

	// Sobrecarga de contrutor
	public Quarto(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	// mascara com to String
	public String toString() {
		return quarto + ": " + nome + ", " + email;
	}
}
