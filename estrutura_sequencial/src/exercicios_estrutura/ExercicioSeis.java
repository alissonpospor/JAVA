package exercicios_estrutura;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */
		Scanner teclado = new Scanner(System.in);

		double a, b, c;

		System.out.println("Digite os valores de A, B e C:");
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		
		
		System.out.println("Triangulo: " + ((a * c) / 2.0));
		System.out.println("Circulo: " + (3.14159 * (Math.pow(c, 2))));
		System.out.println("Trapezio: " + (a + b) / 2.0 * c);
		System.out.println("Quadrado: " + (b * b));
		System.out.println("Retangulo: " + (a * b));
		
		teclado.close();
	}

}
