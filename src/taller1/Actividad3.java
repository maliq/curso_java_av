package taller1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Actividad3 {

	public static void main(String[] args) {
		Date date = new Date(83,2,13);
		String dia = Actividad3.diaPorDate(date);
		System.out.println("dia por date: "+dia);
		Calendar calendar = Calendar.getInstance();
		calendar.set(1983,2,13);
		dia = Actividad3.diaPorCalendar(calendar);
		System.out.println("dia por calendar: "+dia);
		
		Locale loc = new Locale("es","CL");
		SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", loc);
		System.out.println("SimpleDateFormat: "+dayFormat.format(calendar.getTime()));

	}
	
	public static String diaPorDate(Date date){
		String dia = "";
		switch (date.getDay()) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 0:
			dia = "Domingo";
			break;

		default:
			break;
		}
		return dia;
	}
	
	public static String diaPorCalendar(Calendar calendar){
		String dia = ""; 
		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			dia = "Lunes";
			break;
		case Calendar.TUESDAY:
			dia = "Martes";
			break;
		case Calendar.WEDNESDAY:
			dia = "Miercoles";
			break;
		case Calendar.THURSDAY:
			dia = "Jueves";
			break;
		case Calendar.FRIDAY:
			dia = "Viernes";
			break;
		case Calendar.SATURDAY:
			dia = "Sabado";
			break;
		case Calendar.SUNDAY:
			dia = "Domingo";
			break;

		default:
			break;
		}
		return dia;
	}
	
	

}
