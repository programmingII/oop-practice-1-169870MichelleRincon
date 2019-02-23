//Nombre: Tanya Michelle Rincon Tarango
//Dia: 23/02/19
//Hora: 2:55pm - 3:10pm

import java.util.Scanner; //Se importa la libreria que permite leer datos desde teclado

class Ejercicio57{
	public static void main (String [] args){
		Scanner num = new Scanner (System.in); //Se crea el objeto que almacenara datos
		
		int x, cont=0; //Se declara una variable de tipo entero
	
		System.out.println("Ingresa un numero"); //Se pide al usuario que ingrese un numero
		x = num.nextInt(); //Se almacena el numero en x

		for (int i = 1; i<=(int)Math.sqrt(x);i++){  //Ciclo for que vas desde 1 hasta el resultado de la raiz cuadrada de x con incremento de 1
			if(x%i == 0 && (i*i)!=x) //Entra al ciclo solo si el residuo de x entre el valor de i es cero y  i al cuadrado es diferente de x
				cont = cont + 2; //En la variable cont se suma cont mas dos
			else if ((i*i) == x) // entra al ciclo solo si i al cuadrado es igual a x
				cont++; //se incrementa uno al contador
		}
		System.out.println(cont);//Se imprime el resultado del contador 
	}
}