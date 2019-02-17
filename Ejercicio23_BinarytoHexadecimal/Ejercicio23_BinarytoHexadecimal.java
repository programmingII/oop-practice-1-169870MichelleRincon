//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 4:45pm - 5:00pm

import java.util.Scanner; //Se importa la libreria que se utiliza para leer

class Ejercicio23{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in); //Se crea el objeto bin que almacenara los datos
		String bin, hex; //Se declaran dos variables de tipo string

		System.out.println("Ingresa un numero binario"); //Se pide al usuario que ingrese un numero de tipo binario
		bin=num.nextLine(); //El numero binario se almacena en la variable bin

		hex=Integer.toString(Integer.parseInt(bin,2),16); //De la clase Integer con el objeto toString se convierte en cadena de base 16 indicado dentro del parentesis, lo que anteriormente fue convertido de binario a decimal.
		
		System.out.printf("Binario = "+bin+" a Hexadecimal = "+hex); //Se almacena la cadena hexadecimal almacenada en la variable hex.
	}
}