//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 10:22pm - 

import java.util.Scanner; //Se importa la libreria que almacena datos

class Ejercicio32{
	public static void main(String[] args){
		Scanner num = new Scanner (System.in); //Se crea el objeto num que almacenara datos

		int x,y,compare; //Se declaran dos variables de tipo entero

		System.out.println("Ingresa dos numeros"); //Se pide al usuario que ingrese dos numeros
		x = num.nextInt(); //Se lee el primer numero
		y = num.nextInt(); //Se lee el segundo numero

		compare = Integer.valueOf(x).compareTo(Integer.valueOf(y)); ////De la clase integer se utiliza el metodo valueOf que almacena un valor y compareTo que compara entre dos valores

		if(compare == -1) //Entra al ciclo si el resultado de compare es -1
			System.out.printf(""+x+" > "+y); //Imprime que x es mayor que y
		if(compare == 1) //Entra al ciclo si el resultado de compare es 1
			System.out.printf(""+x+" < "+y); //imprime que y es mayor que x
		if(compare == 0) //Entra al ciclo si el resultado de compare es 0
			System.out.printf(""+x+" == "); //imprime que x y y son iguales
	}
}