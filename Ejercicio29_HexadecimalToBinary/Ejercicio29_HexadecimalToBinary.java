//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 9:26pm - 9:31pm

import java.util.Scanner; //Se importa la libreria que nos permite leer datos

class Ejercicio29{
	public static void main(String[] args){
		Scanner num = new Scanner (System.in); //Se crea el objeto num que almacenara datos

		String hex, bin; //Se crean dos variables de tipo string

		System.out.println("Ingresa un numero hexadecimal"); //Se pide al usuario que ingrese un numero hexadecimal
		hex = num.nextLine(); //Se almacena el dato ingresado en la variable hex

		bin = Integer.toBinaryString(Integer.parseInt(hex,16)); //De la clase Integer con el objeto toBinaryString se convierte a binario el dato previamente convertido de bbase 16 a base 10

		System.out.printf("Hexadecimal = "+hex+" a Binario = "+bin); //Se imprime el valor almacenado en bin
	}
}