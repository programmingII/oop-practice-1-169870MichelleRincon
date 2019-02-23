//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 1:49pm - 1:54pm

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio52{
	public static void main (String [] args){
		Scanner num = new Scanner (System.in); //Se creal el objeto cad que almacenara datos
		
		int a, b, c; //Se declaran tres variables de tipo entero

		System.out.println("Ingresa tres numero"); //Se pide la usuario que ingrese tres numeros
		a = num.nextInt(); //Se aalmacena el primero en a
		b = num.nextInt(); //Se almancena el segundo en b
		c = num.nextInt(); //Se almacena el tercero en c

		if((a+b)==c){ //Se revisa si la suma de a y b es igual a c
			System.out.println("La suma del primer numero ("+a+") y el segundo numero ("+b+") es igual al tercer numero ("+c+")");
		} else {
			System.out.println("La suma del primer numero ("+a+") y el segundo numero ("+b+") es diferente al tercer numero ("+c+")");
		}
	}
}
		