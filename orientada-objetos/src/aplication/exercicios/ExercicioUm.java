package aplication.exercicios;

import java.util.Scanner;

import entities.exercicios.Retangulo;

public class ExercicioUm {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
		 * seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma
		 * classe como mostrado no projeto ao lado.
		 */

		Scanner teclado = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		System.out.println("Entre com a Altura e Base");
		retangulo.altura = teclado.nextDouble();
		retangulo.base = teclado.nextDouble();

		System.out.println("Area = " + retangulo.area());
		System.out.println("Perimetro = " + retangulo.perimetro());
		System.out.println("Diagonal = " + retangulo.diagonal());
		
		teclado.close();
	}

}
