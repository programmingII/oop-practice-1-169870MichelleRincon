//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 8:30pm - 8:45pm

import java.util.Scanner; //Se importa la libreria que nos permite almacenar datos

class Ejercicio41{
	public static void main(String [] args){	
		Scanner X = new Scanner (System.in);
		char x='B'; //Se declara una variable x de tipo caracter

		//System.out.println("Ingresa un caracter"); //Se pide al ususario que ingrese un caracter
		//x = X.nextChar(); //Se almacena el valor en x

		int ascii = (int) x; //Se convierte a entero lo contenido en x char y se almacena en ascii
		System.out.println("El codigo Ascii de "+x+" es = "+ascii); //Se imprime el numero ascii
	}
}