//Nombre: Tanya Michelle Rincon Tarango
//Dia: 21/02/19
//Hora: 12:27pm - 12:45pm

import java.util.Scanner; //Se importa la libreria que permite que ingresemos mas numeros

class Ejercicio33{
	public static void main(String[] args){
		Scanner Num = new Scanner (System.in); //Se crea el objeto Num para almacenar datos
		
		int x, sum=0; //Se declara dos variables de tipo entero, sum se inicializa en cero para que ya tenga un valor

		System.out.println("Ingresa un numero entero"); //Se pide al usuario que ingrese un numero
		x = Num.nextInt(); //Se almacena el numero en la variable entera x

		while(x!=0){ //Se inicia un ciclo de tipo while el cual entrara al ciclo siempre y cuando x sea diferente de 0
			sum = sum + (x % 10); //En la variable sum se almacena el resultado de sum mas el residuo de dividir el numero entre 10, del cual solo se almacena el numero entero
			x = x /10; //En la variable x se almacena el resultado entero de x entre 10, dicho resultado es el que ahora sera evaluado en el while
		}
		System.out.println("La suma de los digitos es: "+sum); //Se imprime el resultado de la suma
	}
}