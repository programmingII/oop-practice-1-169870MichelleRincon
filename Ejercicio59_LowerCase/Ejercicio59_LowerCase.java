//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 4:17pm - 4:25pm

import java.util.Scanner; //Se importa la libreria para almacenar datos

class Ejercicio59{
	public static void main(String [] args){
		Scanner s = new Scanner (System.in); //Se crea el objeto s para almacenar datos

		String cad; //Se declara una variable de tipo string 

		System.out.println("Ingresa una cadena"); //Se pide al usuario que ingrese una cadena
		cad = s.nextLine(); //Se almacena la cadena en cad

		cad = cad.toLowerCase(); //De la clase Character con el metodo toLowerCase se convierte a minuscula lo que esta antes del punto
		System.out.println(cad); //Se imprimen en minusculas
	}
}