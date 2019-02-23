//Nombre: Tanya Michelle Rincon Tarango
//Dia: 21/02/19
//Hora: 6:59pm - 7:11pm

import java.util.Scanner; //Se importa la libreria Scanner que permite almacenar datos

class Ejercicio36{
	public static void main (String[] args){
		Scanner x = new Scanner (System.in);

		double lat1, lat2, lon1, lon2, d, r=6371.01; //Se declaran 6 variables de tipo double y una de ellas se inicializa en 6371.01

		System.out.println("Ingresa latitud 1"); //Se pide al usuario que ingrese el dato 1
		lat1 = x.nextDouble(); //Se almacena el dato 1 
		System.out.println("Ingresa longitud 1"); //Se pide al usuario que ingrese el dato 2
		lon1 = x.nextDouble(); //Se almacena el dato 2
		System.out.println("Ingresa latitud 2"); //Se pide al usuario que ingrese el dato 3
		lat2 = x.nextDouble(); //Se almacena el dato 3
		System.out.println("Ingresa longitud 2"); //Se pide al usuario que ingrese el dato 4
		lon2 = x.nextDouble(); //Se almacena el dato 4

		lat1 = Math.toRadians(lat1); //Se cambia a radianes los 4 datos para que se trabajen con trigonometria
		lat2 = Math.toRadians(lat2);
		lon1 = Math.toRadians(lon1);
		lon2 = Math.toRadians(lon2);

		d = r * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2)); //Se resuelve la operacion y se almacena en d

		System.out.println("La distancia es = "+d); //Se imprime el resultado de d
	}
}