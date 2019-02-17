//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 10:07pm - 10:21pm

import java.util.Scanner; //Se importa la libreria que almacena datos

class Ejercicio32{
	public static void main(String[] args){
		Scanner num = new Scanner (System.in); //Se crea el objeto num que almacenara datos

		int x,y; //Se declaran dos variables de tipo entero

		System.out.println("Ingresa dos numeros"); //Se pide al usuario que ingrese dos numeros
		x = num.nextInt(); //Se lee el primer numero
		y = num.nextInt(); //Se lee el segundo numero

		System.out.println(""+x+" "+Integer.valueOf(x).compareTo(Integer.valueOf(y))+" "+y); //Se comparan directamente y se imprime. de la clase integer se utiliza el metodo valueOf que almacena un valor y compareTo que compara entre dos valores
		
		/*Devuelve un -1 cuando x es mayor que y
		Devuelve un 1 cuando x es menor que y
		Devuelve un 0 cuando x es igual a y*/

	}
}