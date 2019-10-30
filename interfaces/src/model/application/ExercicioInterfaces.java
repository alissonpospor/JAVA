package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contrato;

public class ExercicioInterfaces {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato");
		System.out.print("Numero: ");
		int contrato = teclado.nextInt();

		System.out.print("Data (dd/MM//yyyy): ");
		String datas = teclado.next();
		Date data = simpleFormat.parse(datas);

		System.out.print("Valor do contrato: ");
		double valor = teclado.nextDouble();
		Contrato conc = new Contrato(contrato, simpleFormat.format(data), valor);

		System.out.print("Número de parcelas: ");
		int numParcelas = teclado.nextInt();

		System.out.println(conc);

		teclado.close();
	}

}
