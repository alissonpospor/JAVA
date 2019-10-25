package aplication.exercicios;

import java.util.Scanner;

import entities.exercicios.Aluno;

public class ExercicioTres {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve
		 * nos tr�s trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
		 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
		 * tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo,
		 * quantos pontos faltam para o aluno obter o m�nimo para ser aprovado (que �
		 * 60% da nota). Voc� deve criar uma classe Student para resolver este problema.
		 */
		Scanner teclado = new Scanner(System.in);
		Aluno aluno = new Aluno();

		aluno.nome = teclado.nextLine();
		aluno.nota = teclado.nextDouble();
		aluno.nota2 = teclado.nextDouble();
		aluno.nota3 = teclado.nextDouble();

		System.out.println("Nota final: " + aluno.notaFinal());

		if (aluno.notaFinal() < 60.0) {
			System.out.println("REPROVADO!");
			System.out.printf("Quanto falta para ser aprovado: " + aluno.notasPerdidas());
		} else {
			System.out.println("APROVADO!");
		}

		teclado.close();
	}

}
