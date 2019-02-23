//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 1:38pm - 1:47pm

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio51{
	public static void main (String [] args){
		Scanner cad = new Scanner (System.in); //Se creal el objeto cad que almacenara datos
		
		String x; //Se declara una variable de tipo string
		int ent; //Se declara una variable de tipo entero

		System.out.println("Ingresa un numero (cadena)"); //Se pide al usuario que ingrese una cadena		
		x = cad.nextLine(); //Se almacena en x

		ent = Integer.parseInt(x); //De la clase integer con el metodo parseInt se convierte a entero lo que hay en x
		
		System.out.println("String = "+x+ ", Entero = "+ent); //Se imprime el resultado de ent
	}
}