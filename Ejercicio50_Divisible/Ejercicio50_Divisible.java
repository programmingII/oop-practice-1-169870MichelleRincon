//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 1:29pm - 1:36pm

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio50{
	public static void main (String [] args){
		Scanner num = new Scanner (System.in); //Se creal el objeto num que almacenara datos

		int x; //Se declara una variable de tipo entero

		System.out.println("Ingresa un numero");//Se pide al ususario que ingrese un numero
		x = num.nextInt(); //Se almacena el numero en la variable x

		for(int i=1; i<=100; i++){ //Se utiliza ciclo for que recorre los numero desde 1 hasta 100
			if(i%x == 0){ //Si el numero i es divisible entre x y el residuo es igual a cero entra al ciclo
				System.out.println(i); //Se imprime el numero almacenado en i
			}
		}
	}
}