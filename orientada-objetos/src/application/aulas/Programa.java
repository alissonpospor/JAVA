package application.aulas;

import java.util.Scanner;

import entities.Triangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Enter the measures of triangle X: ");
		x.a = teclado.nextDouble();
		x.b = teclado.nextDouble();
		x.c = teclado.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = teclado.nextDouble();
		y.b = teclado.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Area do triangulo X: " + areaX);
		System.out.printf("Area do triangulo Y: " + areaY);

		if (areaX > areaY) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");
		}
		teclado.close();
	}

}
