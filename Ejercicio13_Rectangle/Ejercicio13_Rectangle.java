//Nombre: Tanya Michelle Rincon Tarango
//Dia: 11/02/19
//Hora: 9:10pm - 9:19pm

import  java.util.Scanner; //Se importa libreria que permite leer datos desde teclado

class Ejercicio13{
	public static void main(String[] args){
		Scanner Num=new Scanner(System.in); //Se crea el objeto que almacenara los datos introducidos desde teclado

 		float W, H, A, P; //Se crean cuatro variables de tipo flotante

		System.out.println("Ingresa base y altura del rectangulo: "); //Se pide al usuario que ingrese los datos necesarios
		W=Num.nextFloat(); //Se almacena en la variable W el primer dato
		H=Num.nextFloat(); //Se almacena en la variable H el segundo dato

		A=W*H; //Se hace la operacion para el area y se almacena en la variable A
		P=2*(W+H); //Se hace la operacion para el perimetro y se almacena en la variable P

		System.out.println("Perimetro = "+P); //Se imprime el resultado del perimetro
		System.out.println("Area = "+A); //Se imprime el resultado del area
	}
}