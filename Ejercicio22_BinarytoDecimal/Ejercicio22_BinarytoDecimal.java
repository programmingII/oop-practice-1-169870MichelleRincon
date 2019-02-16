//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 10:35am - 10:44am

import java.util.Scanner; //Se importa la libreria que se utiliza para leer

class Ejercicio22{
	public static void main(String[] args){
		Scanner bin = new Scanner(System.in); //Se crea el objeto bin que almacenara los datos

		String binx; //Se declara una variable de tipo string
		int dec; //Se declara una variable de tipo entero

		System.out.println("Ingresa un numero binario"); //Se pide al usuario que ingrese un numero de tipo binario
		binx=bin.nextLine(); //Se almacena en binx el numero binario

		dec=Integer.parseInt(binx,2); //En dec se almacena la conversion, de la clase Integer se utiliza el objeto parseInt que es el que realiza la conversion indicandole el tipo de dato que cambiara

		System.out.printf("Binario = "+binx+" a decimal = "+dec); //Se imprime el resultado almacenado en dec
	}
}