package entites;

public class Retangulo {
	//Objeto do exercicio 1
	public double altura;
	public double base;

	public double area() {
		return (altura * base);
	}

	public double perimetro() {
		return ((base + base) + (altura + altura));
	}

	public double diagonal() {
		// d² = b² + h²
		double diagonal = Math.pow(base, 2) + Math.pow(altura, 2);
		return Math.sqrt(diagonal);
	}
}
