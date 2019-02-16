//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 9:59am - 10:11am

import java.util.Scanner; //Se importa la libreria para leer datos

class Ejercicio20{
	public static void main(String[] args){
		Scanner dec=new Scanner(System.in); //Se crea el objeto bin en el que se almacenaran los datos
		int num; //Se declara una variable de tipo entero
		String hex; //Se crea una variable de tipo String
	
		System.out.println("Ingresa un numero decimal"); //Se pide al usuario que ingrese un numero decimal
		num=dec.nextInt(); //Se almacena el numero en la variable num

		hex=Integer.toHexString(num); //En la variable hex se almacena la conversion, se utiliza de la clase Integer el objeto toHexString que es el que convierte de decimal a hexademal

		System.out.printf("Decimal = "+num+" a Hexadecimal = "+hex); //Se imprime el resultado almacenado en hex
	}
}