//Nombre: Tanya Michelle Rincon Tarango
//Dia: 11/02/19
//Hora: 8:11pm - 8:34pm

import  java.util.Scanner; //Se importa libreria que permite leer datos desde teclado

class Ejercicio11{
	public static void main(String[] args) {
		Scanner circle = new Scanner(System.in); //Se crea el objeto circle que almacenara los datos introducidos desde el teclado

		Double r, p, a; //Se crean de tipo double por los datos que almacenara

		System.out.println("Ingresa el radio del circulo: \n"); //Se pide al usuario que ingrese el valor del radio
		r=circle.nextDouble(); //Se almacena en r el valor del radio

		p=(2*3.1416)*(r); //Se hace la operacion para el perimetro y se almacena en la variable p
		a=(3.1416)*(r*r); //Se hace la operacion para el area y se almacena en la variable a

		System.out.println("Perimetro del circulo = "+p); //Se imprime el resultado de p
		System.out.println("Area del circulo = "+a); /Se imprime el resultado de a

	}
}