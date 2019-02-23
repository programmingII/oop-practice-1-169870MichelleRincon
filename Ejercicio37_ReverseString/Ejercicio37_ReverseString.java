//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 7:19pm - 7:31pm

import java.util.Scanner; //Se importa la libreria para almacenar datos

class Ejercicio37{
	public static void main(String [] args){
		Scanner s = new Scanner (System.in); //Se crea el objeto s para almacenar datos

		char [] cad; //Se declara un arreglo de tipo char

		System.out.println("Ingresa la cadena"); //Se pide al usuario que ingrese una cadena
		cad = s.nextLine().toCharArray(); //Se almacena la cadena en el arreglo

		for(int i=cad.length - 1; i>=0; i--){ //Con un ciclo for que se evalua del tamaño de la cadena hasta cero decrementando 1 en cada iteracion
			System.out.println(cad[i]); //Se imprime el contenido de la cadena 
		}
	}
}