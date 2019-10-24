package aplication.array.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// EXERCICIO DE FIXAÇÃO SOBRE MATRIZES, SEM NECESSARIO USAR OBJETO

		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Quantidade de linhas:");
		int linhas = teclado.nextInt();

		System.out.print("Quantidade de colunas:");
		int colunas = teclado.nextInt();

		// Criando a matriz com os valores determinados pelo usuário:
		int[][] matriz = new int[linhas][colunas];

		// Povoar a matriz com numeros aleatorios
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(11);
			}
		}

		for (int[] is : matriz) {
			System.out.println("Aqui:" + is);
			for (int[] is2 : matriz) {
				//TERMINAR AQUI
				System.out.println("Lá: " + is2);
			}
		}
	}

}
