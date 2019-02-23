//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 2:05pm - 2:09pm

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio54{
	public static void main (String [] args){
		Scanner num = new Scanner (System.in); //Se creal el objeto cad que almacenara datos
		
		int a, b, c; //Se declaran tres variables de tipo entero

		System.out.println("Ingresa tres numero"); //Se pide la usuario que ingrese tres numeros
		a = num.nextInt(); //Se aalmacena el primero en a
		b = num.nextInt(); //Se almancena el segundo en b
		c = num.nextInt(); //Se almacena el tercero en c

		if ((a%10 == b%10)||(a%10 == c%10)||(b%10 == c%10)) //Revisa que al menos dos de los numeros tengan la misma cantidad de digitos
			System.out.println("Verdadero: al menos dos de los numeros "+a+", "+b+" y "+c+" tienen los mismo digitos");
		else 
						System.out.println("Falso: menos dos de los numeros "+a+", "+b+" y "+c+" tienen los mismo digitos");
	}
}