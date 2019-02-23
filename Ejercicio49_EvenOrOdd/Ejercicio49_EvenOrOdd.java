//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 1:19pm - 1:27pm

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio49{
	public static void main (String [] args){
		Scanner num = new Scanner (System.in); //Se crea el objeto num en el que se almacenaran datos

		int x; //Se declara una variable de tipo entero

		System.out.println("Ingresa un numero");//Se pide al usuario que ingrese un numero
		x = num.nextInt(); //Se almacena el numero en x

		if(x%2 == 0){ //Si el residuo del numero entre 2 es cero es par
			System.out.println("El numero "+x+" es par");  //Se imprime que es par
		}
		if(x%2 == 1){ //Si el residuo del numero entre 2 es uno es impar
			System.out.println("El numero "+x+" es impar"); //Se imprime que es impar
		}
	}
}