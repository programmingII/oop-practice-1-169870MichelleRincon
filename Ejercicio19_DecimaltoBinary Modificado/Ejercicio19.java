//Nombre: Tanya Michelle Rincon Tarango
//Dia: 14/02/19
//Hora: 12:55pm - 13:08pm

import java.util.Scanner; //Importamos la libreria que nos permite leer datos

class Conversion{
	public static void main(String[] args){
		Scanner bin=new Scanner(System.in); //Se crea el objeto de nombre bin que almacenara datos
		int num; //Se declara una variable de tipo entero num

		System.out.printf("Introduce un numero entero: "); //Se pide al usuario que ingrese un numero
		num=bin.nextInt(); // Se lee el numero que ingresa el usuario, se almacena en num

		if(num>0){	//Se crea un ciclo con la condicional de que entra solo si el num es mayor que cero
			System.out.printf("Binario: "+(Integer.toBinaryString(num))); //Se imprime el numero binario
		}	
	}
}