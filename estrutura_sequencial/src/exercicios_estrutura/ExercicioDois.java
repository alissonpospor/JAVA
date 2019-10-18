package exercicios_estrutura;

import java.util.Scanner;

public class ExercicioDois {
	
	public static void main(String[] args) {

		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos
		 * Fórmula da área: area = π . raio2 | Considere o valor de π = 3.14159
		 */

		Scanner teclado = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Digite o valor de um raio: ");
		raio = teclado.nextDouble();
		
		area = (3.14159 * (Math.pow(raio, 2)));
		
		System.out.println("Valor da área: " + area);
		
		teclado.close();
	}
}
