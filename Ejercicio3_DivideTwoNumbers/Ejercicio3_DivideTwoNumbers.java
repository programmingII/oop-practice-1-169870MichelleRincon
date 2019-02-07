//Nombre: Tanya Michelle Rincon Tarango
//Dia: 07 / 02 / 19
//Hora: 8:00pm

import java.util.Scanner;

class DivideTwoNumbers{
	public static void main(String[] args){

		Scanner Operator=new Scanner(System.in); //Se crea el objeto Operator que almacena los numeros
		int n1,n2; //Se crean variables enteras para leer los dos numeros
		float div; //Se crea variable de tipo float para el resultado de la division
	
		System.out.println("Ingresa dos numeros"); //Se muestra mensaje que pide al usuario que ingrese los numeros
		n1=Operator.nextInt(); //Se almancena el primer numero
		n2=Operator.nextInt(); //Se almacena el segundo numero
		div=n1/n2; //El programa realiza la division

		System.out.println(""+n1+" / "+n2+" = "+div); //Se muestra en pantalla el resultado de la division
	}
}