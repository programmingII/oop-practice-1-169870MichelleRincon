//Nombre: Tanya Michelle Rincon Tarango
//Dia: 09/02/19
//Hora: 11:51 - 12:20

import java.util.Scanner; //Es la libreria que me permite leer datos desde consola

class Ejercicio9{
	public static void main(String[] args){
		
		Scanner num=new Scanner(System.in); //Se crea el objeto n que almacenara el numero desde el teclado y la opcion
		
		int n, o, x, r, aw; //Se declaran cinco variables de tipo entero

		System.out.println("Ingresa tu numero inicial"); //Se pide al usuario que ingrese un primer dato
		n=num.nextInt(); //El dato inicial es almacenado en la variable n

		do{ //Se crea un ciclo do while para que el usuario decida si quiere continuar o no
			System.out.println("Que operacion deseas hacer?\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n"); //Se muestra al usuario un menu con las operaciones que puede realizar
			o=num.nextInt(); //Se almacena la opcion que elige el usuario en la variable o
			
			System.out.println("Tu numero inicial es "+n+"\n"); //Se muestra al usuario su numero inicial
			
			System.out.println("Ingresa otro numero para hacer la operacion"); //Se pide al usuario que ingrese un segundo dato
			x=num.nextInt(); //Se almacena el segundo dato en la variable x
			
			switch(o){ //Se crea un ciclo switch para trabajar con las opciones que elija el usuario
				case 1: //instruccion si el usuario elige suma
					r=n+x;
					System.out.println(n+" + "+x+" = "+r+"\n"); //se imprime el resultado de la suma
					n=r; //El resultado obtenido toma el lugar del numero inicial
				break; //se termina la instruccion de suma

				case 2: //instruccion para resta
					r=n-x;
					System.out.println(n+" - "+x+" = "+r+"\n"); //se imprime el resultado de resta
					n=r; //el resultado obtenido toma el lugar del numero inicial
				break;// se termina la instruccion de resta
	
				case 3: //instruccion de multiplicacion
					r=n*x;
					System.out.println(n+" * "+x+" = "+r+"\n"); //se imprime el resultado de division
					n=r; //el resultado obtenido toma el lugar del numero inicial
				break; //se termina la instruccion de resta

				case 4: //instruccion para division
					r=n/x;
					System.out.println(n+" / "+x+" = "+r+"\n"); //se imprime el resultado de division
					n=r; //el resultado obtenido toma el lugar del numero inicial
				break; //se terminala instruccion para division
			}
				System.out.println("Deseas continuar? SI = 1 NO = 0"); //Se pregunta al usuario si desea continuar
				aw=num.nextInt(); //Se almacena la resppuesta del usuario con la variable aw
		} while(aw==1); //El ciclo do while continua siempre y cuando la respuesta del usuario sea 1
	}
}
