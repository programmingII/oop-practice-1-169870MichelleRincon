//Nombre: Tanya Michelle Rincon Tarango
//Dia: 07 / 02 / 19
//Hora: 8:00pm

import java.util.Scanner;

class SumTwoNumbers{
	public static void main(String[] args){

		int n1,n2,sum; //Se declaran variables enteras para los dos numeros que se ingresan y para el resultado de la suma

		Scanner	digito=new Scanner(System.in); //Se crea el objeto que va a almacenar los numeros
		System.out.println("Ingresa dos numeros "); //Se pide al usuario Que ingrese dos numeros
		n1=digito.nextInt(); //Se lee el primer numero
		n2=digito.nextInt(); //Se lee el segundo numero
		sum=n1+n2; //El programa realiza la suma de los dos numeros
		System.out.println(""+n1+" + "+n2+" = "+sum); //Se imprime en pantalla el resultado de la suma
	}
}