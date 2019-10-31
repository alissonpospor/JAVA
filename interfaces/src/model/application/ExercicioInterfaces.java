package model.application;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Quota;
import model.services.ContratoServico;
import model.services.ServicoPaypal;

public class ExercicioInterfaces {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato");
		System.out.print("Numero: ");
		int contrato = teclado.nextInt();

		System.out.print("Data (dd/MM//yyyy): ");
		Date data = simpleFormat.parse(teclado.nextLine());

		System.out.print("Valor do contrato: ");
		double valor = teclado.nextDouble();

		Contrato conc = new Contrato(contrato, data, valor);
		// simpleFormat.format(data)
		System.out.print("Número de parcelas: ");
		int numParcelas = teclado.nextInt();

		ContratoServico cont = new ContratoServico(new ServicoPaypal());

		cont.processoDeContrato(new Contrato(), numParcelas);

		System.out.println();
		System.out.println("Prestação: ");
		for (cont xx : cont.get ) {
			
		}

		teclado.close();
	}

}
