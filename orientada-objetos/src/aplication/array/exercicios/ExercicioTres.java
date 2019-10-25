package aplication.array.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// EXERCICIO DE FIXA��O SOBRE MATRIZES, SEM NECESSARIO USAR OBJETO

		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();// calasse para gerar n�meros random

		System.out.print("Quantidade de linhas:");
		int linhas = teclado.nextInt();

		System.out.print("Quantidade de colunas:");
		int colunas = teclado.nextInt();

		// Criando a matriz com os valores determinados pelo usu�rio:
		int[][] matriz = new int[linhas][colunas];

		// Povoar a matriz com numeros aleatorios
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(16);
			}
		}

		// mostrar no console a matriz
		for (int[] array : matriz) {
			for (int valor : array) {
				System.out.print(valor + " \t");

			}
			System.out.println("");
		}

		System.out.println("Escolha um n�mero: ");
		int numero = teclado.nextInt();

		// Valida��es
		for (int c = 0; c < matriz.length; c++) {
			for (int j = 0; j < matriz[c].length; j++) {
				if (matriz[c][j] == numero) {
					System.out.println("Posi��o " + c + ", " + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[c][j - 1]);
					}
					if (c < matriz.length - 1) {
						System.out.println("Baixo: " + matriz[c + 1][j]);
					}
					if (j < matriz[c].length - 1) {
						System.out.println("Direita: " + matriz[c][j + 1]);
					}
					if (c > 0) {
						System.out.println("Cima: " + matriz[c - 1][j]);
					}
				}

			}
		}
		teclado.close();
	}

}
