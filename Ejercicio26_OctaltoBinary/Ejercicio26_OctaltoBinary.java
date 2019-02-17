//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 5:16pm - 5:22pm

import java.util.Scanner; //Se importa la libreria que se utiliza para leer

class Ejercicio26{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in); //Se crea el objeto num que almacenara los datos

		String oct, bin; //Se declaran dos variable de tipo String

		System.out.println("Ingresa un numero octal");//Se pide al usuario que ingrese un numero octal
		oct = num.nextLine(); //El numero octal se almacena en la variable oct

		bin = Integer.toString(Integer.parseInt(oct,8),2); //De la clase Integer con el objeto toString se convierte a base dos el dato que previamente fue convertido de base 8 a decimal

		System.out.printf("Octal = "+oct+" a Binary = "+bin); //Se imprime el resultado bin
	}
}