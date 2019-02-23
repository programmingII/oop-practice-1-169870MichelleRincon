//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 7:35pm - 7:54pm

import java.util.Scanner; //Se importa la libreria para almacenar datos

class Ejercicio38{
	public static void main(String [] args){
		Scanner s = new Scanner (System.in); //Se crea el objeto s para almacenar datos
		
		char [] cad; //Se declara un arreglo de tipo char
		int letter = 0, digit = 0, space = 0, other = 0; //Se declaran cuatro contadores para cada cosa a identificar y se inicializan en cero

		System.out.println("Ingresa una cadena"); //Se pide al usuario que ingrese una cadena
		cad = s.nextLine().toCharArray(); //Se almacena la cadena en el arreglo

		for(int i = 0; i<cad.length; i++){ //Se utiliza un ciclo que va desde cero hasta el valor de la longitud de la cadena incrementando de 1 
			// Se utiliza de la clase Character los metodos que identifican lo que es cada caracter
			
			if(Character.isLetter(cad[i])){ //Se evalua el caracter para ver si es letra
				letter++; //Se incrementa uno al contador
			}
			else if(Character.isDigit(cad[i])){ //Se evalua el caracter para ver si es numero
				digit++; //Se incrementa uno al contador
			}
			else if(Character.isSpaceChar(cad[i])){ ////Se evalua el caracter para ver si es un espacio
				space++; //Se incrementa uno al contador
			}
			else{ //Si no es letra, digito o espacio entra aqui
				other++; //Se incrementa uno al contador
			}
		}
			//Se imprimen los resultados de cada contador	
		
		System.out.println("letra = "+letter); 
		System.out.println("numero = "+digit);
		System.out.println("espacio = "+space);
		System.out.println("otro = "+other);
	}
}