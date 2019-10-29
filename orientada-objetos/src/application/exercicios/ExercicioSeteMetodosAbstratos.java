package application.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.exercicios.Contribuinte;
import entities.exercicios.PessoaFisica;
import entities.exercicios.PessoaJuridica;

public class ExercicioSeteMetodosAbstratos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		int count = teclado.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println("Dados do " + i + "# contribuinte:");
			System.out.print("Pessoa física ou juridica (f/j)? ");
			char tipo = teclado.next().charAt(0);

			System.out.print("Nome: ");
			String nome = teclado.next();

			System.out.print("Ganho Anual:");
			double ganhoAnual = teclado.nextDouble();

			if (tipo == 'f') {
				System.out.print("Despesas com saúde: ");
				double gastos = teclado.nextDouble();
				lista.add(new PessoaFisica(nome, ganhoAnual, gastos));
			} else {
				System.out.print("Número de empregados: ");
				int empregados = teclado.nextInt();
				lista.add(new PessoaJuridica(nome, ganhoAnual, empregados));
			}

		}
		System.out.println("");
		System.out.println("Impostos Pagos: ");
		double auxiliar = 0.0;
		for (Contribuinte contribuinte : lista) {
			double imposto = contribuinte.imposto();
			System.out.println(contribuinte.getNome() + ", R$ " + imposto);
			auxiliar += imposto;
		}
		System.out.println();
		System.out.println("Total de imposto: R$ " + auxiliar);
		teclado.close();
	}

}
