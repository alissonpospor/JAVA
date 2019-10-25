package entities.exercicio;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date diaAniversario;

	public Cliente(String nome, String email, Date data) {
		this.nome = nome;
		this.email = email;
		this.diaAniversario = data;
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Cliente: " + nome + diaAniversario + " - " + email;
	}

}
