//Nombre: Tanya Michelle Rincon Tarango
//Dia: 11/02/19
//Hora: 9:28pm - 9:36pm

import java.util.Scanner;

class Ejercicio15{
	public static void main(String[] args){
		Scanner Num=new Scanner(System.in);

		int x,y,nuevo;

		System.out.println("Ingresa dos numeros enteros");		
		x=Num.nextInt();
		y=Num.nextInt();
		
		System.out.println("\nLos numeros ingresados son X = "+x+", Y = "+y);

		nuevo=x;
		x=y;
		y=nuevo;

		System.out.println("Los numeros luego del intercambio son X = "+x+", Y = "+y);
	}
}
