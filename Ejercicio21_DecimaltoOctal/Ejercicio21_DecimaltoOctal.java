//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 10:25am - 10:34am

import java.util.Scanner; //Se importa la libreria que se utiliza para leer

class Ejercicio21{
	public static void main(String[] args){
		Scanner dec = new Scanner(System.in); //Se crea el objeto dec que almacenara datos
		int num; //Se declara una variable de tipo entero
		String oct; //Se declara una variable de tipo String

		System.out.println("Ingrese un numero decimal"); //Se pide al usuario que ingrese un numero decimal
		num=dec.nextInt(); //Se almacena en num el numero decimal

		oct=Integer.toOctalString(num); //en la variable oct se almacena la operacion. Se utiliza de la clase Integer el objeto toOctalString que es el que convierte el numero

		System.out.printf("Decimal = "+num+" a Octal = "+oct); //Se imprime el resultado de oct y la comparacion
	}
}