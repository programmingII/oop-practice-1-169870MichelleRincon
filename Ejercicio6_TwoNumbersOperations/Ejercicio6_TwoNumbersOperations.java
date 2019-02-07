//Nombre: Tanya Michelle Rincon Tarango
//Dia: 07 / 02 / 19
//Hora: 8:00pm

import java.util.Scanner; //Es la libreria que me permite ingresar datos desde consola

class Ejercicio6{
	public static void main(String[] args){
		
		Scanner dato=new Scanner(System.in); //Se crea el objeto que va a almacenar los numeros desde el teclado
		
		int n1, n2, suma, resta; //Se declaran variables de tipo int para los numeros que se van a utilizar, y para los resultados de la suma y resta
		float producto, division, mod; //Se declaran variables de tipo float para los resultados de producto, division y mod, dado que sus resultados pueden ser flotantes

		System.out.println("Ingresa dos numeros"); //Se muestra un mensaje pidiendo al usuario que ingrese dos numeros
		n1=dato.nextInt(); //Se almacena el numero 1
		n2=dato.nextInt(); //Se almacena el numero 2

		suma=n1+n2; //El programa realiza la suma
		resta=n1-n2; //El programa realiza la resta
		producto=n1*n2; //El programa realiza el producto
		division=n1/n2; //El programa realiza la division
		mod=n1%n2; //El programa realiza el mod

		System.out.println("Suma = "+suma); //Se imprime el resultado de la suma
		System.out.println("Resta = "+resta); //Se imprime el resultado de la resta
		System.out.println("Producto = "+producto); //Se imprime el resultado del producto
		System.out.println("Division = "+division); //Se imprime el resultado de la division
		System.out.println("Mod = "+mod); //Se imprime el resultado del mod
	}
}