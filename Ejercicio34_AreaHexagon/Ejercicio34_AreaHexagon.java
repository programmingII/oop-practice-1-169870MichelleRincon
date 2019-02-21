//Nombre: Tanya Michelle Rincon Tarango
//Dia: 21/02/19
//Hora: 1:02PM - 1:11pm

import java.util.Scanner; //Se importa la libreria Scanner que permite almacenar datos

class Ejercicio34{
	public static void main(String[] args){
		Scanner X = new Scanner (System.in); //Se crea el objeto X que almacenara datos

		int L; //Se declara una variable de tipo entero

		System.out.println("Ingresa la longitud del hexagono"); //Se pide al usuario que ingrese la medida del hexagono
		L = X.nextInt(); //La longitud se almacena en la varaible entera L

		double H = (6*(L*L))/(4*Math.tan(Math.PI/6)); //Se crea una variable de tipo double, en ella se almacena la operacion para el area del hexagono. De la clase math se utilizan los metodos de TAN y PI
		System.out.printf("El area del hexagono es = "+H); //Se imprime el resultado de H
	}
}