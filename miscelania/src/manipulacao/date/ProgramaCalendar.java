package manipulacao.date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramaCalendar {

	public static void main(String[] args) {
		// SOMA DE UNIDADE DE TEMPO
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);// adicionar horas na data
		d = cal.getTime();

		System.out.println(sdf.format(d));

		// Obtendo uma unidade de tempo
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf2.format(data));

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(data);

		int minutes = cal2.get(Calendar.MINUTE);// extração de minutos
		int month = 1 + cal2.get(Calendar.MONTH);// extraindo o mês -- valor começa com 0

		System.out.println("Minutos: " + minutes);
		System.out.println("Mês: " + month);
	}

}
