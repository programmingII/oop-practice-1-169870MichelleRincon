//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 2:21pm -2:32pm

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio55{
	public static void main (String [] args){
		Scanner s = new Scanner (System.in); //Se crea el objeto que almacenara datos
			
		int sec, h, m; //Se declaran cuatro variables de tipo entero

		System.out.println("Ingresa los segundos"); //Se pide al usuario que ingrese el total de segundo
		sec = s.nextInt(); //Se almacenan los segundos en sec

		h = sec / 3600; //Se divide el dato almacenado den sec entre 3600 que es total de segundos en una hora
		m = (sec - (h*3600)) / 60; //Se calcula los seguntos que quedan y se dividen entre 60 que es el total de seguntos en un minuto
		sec = (sec-(h*3600))-(m*60); //Se calculan los segundos que quedan y se almacenan en s

		System.out.println(h+":"+m+":"+sec); //Se imprime la conversion
	}
}