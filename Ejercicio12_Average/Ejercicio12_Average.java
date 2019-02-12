//Nombre: Tanya Michelle Rincon Tarango
//Dia: 11/02/19
//Hora: 8:40pm - 8:53pm

import  java.util.Scanner; //Se importa libreria que permite leer datos desde teclado

class Ejercicio_12{
	public static void main(String[] args){
		Scanner Num=new Scanner(System.in); //Se crea el objeto que va a almacenar los datos introducidos desde el teclado

		float n, sum=0, prom; //Se crean tres variables de tipo flotante y sum se inicializa en cero para ser usado mas adelante
		int t; //Se crea una variable de tipo entero 

		System.out.println("Cuantos numeros desea ingresar"); //Se pregunta al usuario cuantos datos quiere ingresar
		t=Num.nextInt(); //Se almacena en la variable t el total de datos

		for(int i=0;i<t;i++){ //Se crea un ciclo for que va desde cero hasta el numero de datos que el usuario quiere, se crea la variable i de tipo entero
			System.out.println("Ingresa el numero "+(i+1)); // Se pide al usuario que ingrese un numero y se incrementa un valor a i para que inicie en uno
			n=Num.nextFloat(); //Se almacena en la variable n el numero ingresado

			sum=sum+n; //Se suma a sum el numero almacenado en n y dicho resultado pasa a ser el nuevo valor de sum.
		}

		prom=sum/t; //Se realiza la operacion para el promedio y es almacenado en la variable prom

		System.out.println("El promedio es = "+prom); //Se imprime el resultado de prom
	}
}