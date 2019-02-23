//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 2:37pm - 2:44pm

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio56{
	public static void main (String [] args){
		Scanner num = new Scanner (System.in); //Se crea el objeto que almacenara datos
		
		int a, b, c; //Se declaran tres variables de tipo entero

		System.out.println("Ingresa dos numeros de rango y uno divisible"); //Se pide al usuario que ingrese tres numeros
		a = num.nextInt(); //Se almacena el primer numero en a
		b = num.nextInt(); //Se almacena el segundo numero en b
		c = num.nextInt(); //Se almancena el tercer numero en c

		for(int i=a; i<=b;i++) //Con el ciclo for se recorren todos los numero que  van desde a hasta b con incremento de 1
			if(i%c == 0) //Entra al ciclo solo si el residuo de i entre c es igual a cero
				System.out.println(i);  //Se imprime el valor de i
	}
}