//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 5:00pm - 

import java.util.Scanner; //Se importa la libreria que se utiliza para leer

class Ejercicio24{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in); //Se crea el objeto num que almacenara los datos

		String bin, oct; //Se declaran dos variables de tipo String

		System.out.println("Ingresa un numero binario"); //Se pide al usuario que ingrese un numero binario
		bin = num.nextLine(); //El numero binario se almacena en la variable bin

		oct = Integer.toString(Integer.parseInt(bin,2),8); //De la clase Integer con el objeto toString se convierte a base 8 el numero que previamente se convirtio a decimal con el objeto parseInt

		System.out.printf("Binario = "+bin+"a Octal = "+oct); //Se imprime el resultado oct
	}
}