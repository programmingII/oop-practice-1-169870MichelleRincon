//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 9:16pm - 9:21pm

import java.util.Scanner; //Se importa la libreria que permite almacenar datos

class Ejercicio44{
	public static void main(String[] args){
		Scanner num=new Scanner(System.in); //Se crea el objeto num que almacenara datos

		int x; //Se declara una variable de tipo entero

		System.out.println("Ingresa un numero"); //Se pide al usuario que ingrese un numero
		x=num.nextInt();			
		
		System.out.println(x+" + "+x+""+x+" + "+x+""+x+""+x);//Se imprime el valor
	}
}