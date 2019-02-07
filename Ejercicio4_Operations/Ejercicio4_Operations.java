//Nombre: Tanya Michelle Rincon Tarango
//Dia: 07 / 02 / 19
//Hora: 8:00pm

import java.util.Scanner;

class Operations{
	public static void main(String[] args){

		Scanner Operator=new Scanner(System.in);  //Se crea el objeto que almacea los numeros ingresados
		int n1,n2,sum,rest,div,prod,mod; //Se crean variables que almacenaran los numeros y los resultados de las operaciones

		System.out.println("Ingresa dos numeros"); //Se muestra mensaje al usuario para que ingrese dos numeros
		n1=Operator.nextInt();
		n2=Operator.nextInt();
		
		sum=n1+n2; //El programa realiza la suma
		rest=n1-n2; //El programa realiza la resta
		div=n1/n2; //El programa realiza la division
		prod=n1*n2; //El programa realiza el producto
		mod=n1%n2; //El programa realiza el residuo
		
		System.out.println(""+n1+" + "+n2+" = "+sum+"\n"); //Imprime el resultado de la suma
		System.out.println(""+n1+" - "+n2+" = "+rest+"\n"); //Imprime el resultado de la resta
		System.out.println(""+n1+" / "+n2+" = "+div+"\n"); //Imprime el resultado de la division
		System.out.println(""+n1+" * "+n2+" = "+prod+"\n"); //Imprime el resultado del producto
		System.out.println(""+n1+" % "+n2+" = "+mod+"\n"); //Imprime el resultado del residuo
	}
}