//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 5:10pm - 5:14pm

import java.util.Scanner; //Se importa la libreria que se utiliza para leer

class Ejercicio25{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in); //Se crea el objeto num que almacenara los datos

		String oct; //Se declaran una variable de tipo String
		int dec; //Se declara una variable de tipo entero

		System.out.println("Ingresa un numero octal");//Se pide al usuario que ingrese un numero octal
		oct = num.nextLine(); //El numero octal se almacena en la variable oct

		dec = Integer.parseInt(oct,8); //De la clase Integer con el objeto parseInt se convierte el numero almacenado en base 8

		System.out.printf("Octal = "+oct+" a Decimal = "+dec); //Se imprime el resultado oct
	}
}