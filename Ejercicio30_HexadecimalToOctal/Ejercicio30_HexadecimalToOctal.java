//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 9:35pm - 9:39pm

import java.util.Scanner; //Se importa la libreria que nos permite leer datos

class Ejercicio30{
	public static void main(String[] args){
		Scanner num = new Scanner (System.in); //Se crea el objeto num que almacenara datos

		String hex, oct; //Se crean dos variables de tipo string

		System.out.println("Ingresa un numero hexadecimal"); //Se pide al usuario que ingrese un numero hexadecimal
		hex = num.nextLine(); //Se almacena el dato ingresado en la variable hex

		oct = Integer.toOctalString(Integer.parseInt(hex,16)); //De la clase Integer con el objetp toOctalString convertimos a octal el dato previamente convertido de base 16 a base 10

		System.out.printf("Hexadecimal = "+hex+" a Octal = "+oct); //Se imprime el valor almacenado en oct
	}
}