//Nombre: Tanya Michelle Rincon Tarango
//Dia: 07 / 02 / 19
//Hora: 11:15pm - 11:28pm

import java.util.Scanner; //Es la libreria que me permite leer datos desde consola

class Ejercicio7{
	public static void main (String[] args){
		
		Scanner number=new Scanner(System.in); //Se crea el objeto que va a almacenar el numero desde el teclado

		int n; //Se declara una variable de tipo entero, n para el numero que ingrese el usuario

		System.out.println("Ingresa el numero del que quiere la tabla"); //Se pide al usuario que ingrese un numero
		n=number.nextInt(); //Se lee el numero ingresado con la variable n
		
		for(int i=0;i<10;i++) //Se crea un for para llenarla multiplicacion, se declara aqui la variable entera para que solo ocupe memoria dentro del for
		{	
			System.out.println(""+n+" * "+(i+1)+" = "+(n*(i+1))); //Se imprime la tabla de multiplicar y se incrementa 1 a i para que la multiplicacion empiece por 1.
		}
	}
}


