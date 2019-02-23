//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 12:45pm - 1:08pm

import java.text.SimpleDateFormat; //Se importa la libreria en la que se encuentran una serie de formatos
import java.util.Calendar; //Libreria que contiene el metodo calendar, el cual muestra al instante dia, mes, año, horas, etc del sistema
import java.util.TimeZone; //Libreria que contiene el metodo time zone el cual muestra una hora que tiene donde el sistema esta trabajando

class Ejercicio47{
	public static void main (String [] args){
		SimpleDateFormat date = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss.SSS"); //Se crea un objeto date de tipo SimpleDateFormat y en el parentesis se le asigna el tipo de formato que va a tener
		date.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT"))); //de la clase calendar se utiliza el metodo getInstance que devuelve la hora y fecha de la zona o local del system y de la clase TimeZone se utiliza el metodo getTimeZone que da la hora de un lugar especifico, es GMT Porque muestra horas y minutos
	

		System.out.println("\nNow: "+date.format(System.currentTimeMillis())); //Se utiliza la clase System se utiliza el metodo CurrentTimeMillis
	}
}