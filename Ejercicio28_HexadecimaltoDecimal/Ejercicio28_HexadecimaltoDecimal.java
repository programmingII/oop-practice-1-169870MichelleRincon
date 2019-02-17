//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 9:21 pm - 9:25pm

import java.util.Scanner; //Se importa la libreria que se utiliza para leer

class Ejercicio28{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in); //Se crea el objeto num que almacenara los datos

		String hex; //Se declaran una variable de tipo String
		int dec; //Se declara una variable de tipo entero

		System.out.println("Ingresa un numero Hexadecimal");//Se pide al usuario que ingrese un numero hexadecimal
		hex = num.nextLine(); //El numero hexadecimal se almacena en la variable hex

		dec = Integer.parseInt(hex,16); //De la clase Integer con el objeto parseInt se convierte un dato de base 16 a entero base 10

		System.out.printf("Hexadecimal = "+hex+" a Decimal = "+dec); //Se imprime el resultado dec
	}
}