package aulas.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTipoCoringa {
	public static void main(String[] args) {

		List<?> myObjs = new ArrayList<Object>();// Tipo ? é um supertipo de qualquer tipo de lista
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;

		// Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer
		// tipo":
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	// magica funciona aqui
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	// Porém não é possível adicionar dados a uma coleção de tipo curinga
	public static void main2(String[] args) {
		List<?> list = new ArrayList<Integer>();
		list.add(3); // erro de compilação
	}

	public static void main3(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
