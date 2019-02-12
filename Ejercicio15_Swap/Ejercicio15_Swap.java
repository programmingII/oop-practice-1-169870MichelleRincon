//Nombre: Tanya Michelle Rincon Tarango
//Dia: 11/02/19
//Hora: 9:28pm - 9:36pm

import java.util.Scanner; //Se importa libreria que permite leer datos

class Ejercicio15{
	public static void main(String[] args){
		Scanner Num=new Scanner(System.in); //Se crea el objeto Num que va a almacenar los datos introducidos desde el teclado

		int x,y,nuevo; //Se declaran tres variables de tipo entero

		System.out.println("Ingresa dos numeros enteros"); //Se pide al usuario que ingrese dos numeros
		x=Num.nextInt(); //Se almacena el primer numero en la variable x
		y=Num.nextInt(); //Se almacena el segundo numero en la variable y
		
		System.out.println("\nLos numeros ingresados son X = "+x+", Y = "+y); //Se muestra al usuario un mensaje con los valores que ingreso en ese mismo orden

		nuevo=x; //El valor nuevo toma el valor del primer numero
		x=y; //El primer numero que estaba vacio ahora pasa a tomar el valor del segundo numero
		y=nuevo; //El segundo numero que estaba vacia ahora pasa a tener el valor nuevo y nuevo se queda vacio nuevamente

		System.out.println("Los numeros luego del intercambio son X = "+x+", Y = "+y); //Se imprime el valor de x y y ya intercambiados.
	}
}
