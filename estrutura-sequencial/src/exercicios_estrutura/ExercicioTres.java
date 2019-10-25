package exercicios_estrutura;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		d = teclado.nextInt();
		
		System.out.println("Diferença = " + ((a * b)-(c * d)) );
		teclado.close();
	}

}
