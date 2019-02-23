//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 1:57pm -2:01pm 

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio53{
	public static void main (String [] args){
		Scanner num = new Scanner (System.in); //Se creal el objeto cad que almacenara datos
		
		int a, b, c; //Se declaran tres variables de tipo entero

		System.out.println("Ingresa tres numero"); //Se pide la usuario que ingrese tres numeros
		a = num.nextInt(); //Se aalmacena el primero en a
		b = num.nextInt(); //Se almancena el segundo en b
		c = num.nextInt(); //Se almacena el tercero en c

		if(c>b && b>a) //Si el tercer numero es mayor que el segundo y el segundo es mayor que el primero entra al ciclo
			System.out.println("Verdadero: "+c+" es mayor que "+b+", y "+b+" es mayor que "+a); 
		else
			System.out.println("Falso: "+c+" no es mayor que "+b+", o "+b+" no es mayor que "+a); 
	}
}