package application.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import exercicios.entities.ProdutoImportado;
import exercicios.entities.ProdutoUsado;
import exercicios.entities.Produtoo;

public class ExercicioSeisPolimorfismo {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
		List<Produtoo> listaProd = new ArrayList<>();

		System.out.print("Número de produtos: ");
		int numeroProd = teclado.nextInt();

		for (int i = 1; i <= numeroProd; i++) {
			System.out.println("Dados produto #" + i + ": ");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char tipo = teclado.next().charAt(0);

			System.out.print("Nome: ");
			String nome = teclado.next();

			System.out.print("Preço: ");
			double preco = teclado.nextDouble();

			if (tipo == 'i') {
				// importado
				System.out.print("Taxa da Alfandega? ");
				double taxaAlfandega = teclado.nextDouble();
				listaProd.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			} else if (tipo == 'c') {
				// comum
				listaProd.add(new Produtoo(nome, preco));
			} else if (tipo == 'u') {
				// usado
				System.out.println("Data fabricação? (DD/MM/YYYY)");
				String dataFab = teclado.next();

				Date data2 = dataFormat.parse(dataFab);
				listaProd.add(new ProdutoUsado(nome, preco, data2));
			}
		}

		System.out.println("");
		System.out.println("Etiquetas de preços:");
		for (Produtoo prod : listaProd) {
			System.out.println(prod.precoEtiqueta());
		}
		teclado.close();
	}

}
