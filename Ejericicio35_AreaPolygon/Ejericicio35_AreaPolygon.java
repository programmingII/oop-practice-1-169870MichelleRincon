//Nombre: Tanya Michelle Rincon Tarango
//Dia: 21/02/19
//Hora: 1:13PM - 1:18pm

import java.util.Scanner; //Se importa la libreria Scanner que permite almacenar datos

class Ejercicio35{
	public static void main(String[] args){
		Scanner X = new Scanner (System.in); //Se crea el objeto X que almacenara datos

		int L, N; //Se declara una variable de tipo entero

		System.out.println("Cuantos lados tiene el poligono"); //Se pide al usuario que ingrese el numero de lados
		N = X.nextInt(); //Se almacena en N el numero de lados

		System.out.println("Ingresa la longitud del poligono"); //Se pide al usuario que ingrese la medida del poligono
		L = X.nextInt(); //La longitud se almacena en la varaible entera L

		double P = (N*(L*L))/(4*Math.tan(Math.PI/N)); //Se crea una variable de tipo double, en ella se almacena la operacion para el area del hexagono. De la clase math se utilizan los metodos de TAN y PI
		System.out.printf("El area del hexagono es = "+P); //Se imprime el resultado de P
	}
}