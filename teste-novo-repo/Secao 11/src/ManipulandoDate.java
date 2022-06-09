import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDate {

	public static void main(String[] args) {

		// Date dd = new Date();
		// System.out.println("Data de hoje: " + dd);
		// System.out.println("-----------------------------------");

		// Calendar tt = Calendar.getInstance();
		// System.out.println("Data e hora atual: " + tt.getTime());
		// System.out.println();
		// System.out.println("Ano: " + tt.get(Calendar.YEAR));
		// System.out.println("Mês: " + tt.get(Calendar.MONTH));
		// System.out.println("Dia do mês: " + tt.get(Calendar.DAY_OF_MONTH));
		// System.out.println("-----------------------------------");
		// tt.set(Calendar.YEAR, 2022);
		// tt.set(Calendar.MONTH, 7);
		// tt.set(Calendar.DAY_OF_MONTH, 31);
		// System.out.println("Ano: " + tt.get(Calendar.YEAR));
		// System.out.println("Mês: " + tt.get(Calendar.MONTH));
		// System.out.println("dia do mes: " + tt.get(Calendar.DAY_OF_MONTH));

		// Calendar tt = Calendar.getInstance();
		// int hora = tt.get(Calendar.HOUR_OF_DAY);

		// if (hora > 6 && (hora < 12)) {
		// System.out.println("BOM DIA!");
		// } else if (hora > 12 && (hora < 18)) {
		// System.out.println("BOA TARDE!");
		// } else {
		// System.out.println("BOA NOITE!");

		// }
		// if (hora>6 && (hora<12)) {
		// System.out.println(hora+"h" + " da manhã");
		// }else if (hora>12 && (hora<18)) {
		// System.out.println(hora+"h" + " da tarde");
		// }else {
		// System.out.println(hora+"h" + " da noite");

		// Calendar tt = Calendar.getInstance();
		// tt.set(2013, Calendar.FEBRUARY, 28);
		// Date data = tt.getTime();
		// System.out.println("Data atual sem formatação: " + data);

		// FORMATAR DATA:

		// DateFormat formataData = DateFormat.getDateInstance();
		// System.out.println("Data atual com formatação: " + formataData.format(data));

		// DateFormat hora = DateFormat.getTimeInstance();
		// System.out.println("Hora atual com formatação: " + hora.format(data));

		// DateFormat dataHora = DateFormat.getDateTimeInstance();
		// System.out.println("Hora e data atual com formatação: " +
		// dataHora.format(data));

		Calendar tt = Calendar.getInstance();
		Date dd = tt.getTime();

		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Data brasileira: " + f.format(dd));

		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data sem o dia descrito: " + f.format(dd));

		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data resumida 1: " + f.format(dd));

		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data resumida 2: " + f.format(dd));

	}

}
