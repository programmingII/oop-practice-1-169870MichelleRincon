//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 3:35pm - 3:53pm

import java.util.Scanner; //Se importa la libreria para almacenar datos

class Ejercicio58{
	public static void main(String [] args){
		Scanner s = new Scanner (System.in); //Se crea el objeto s para almacenar datos

		String cad; //Se declara una variable de tipo string 

		System.out.println("Ingresa una cadena"); //Se pide al usuario que ingrese una cadena
		cad = s.nextLine(); //Se almacena la cadena en cad

		Scanner linea = new Scanner(cad); //Se creal un objeto linea en la cual solo entra la cadena cad
		String mayus = ""; //Se inicializa una variable mayus de tipo cadena 

		while(linea.hasNext()){ //Revisa de token en token y vuelve a iniciar cada que encuenta que sigue otro token
			String letter = linea.next(); //Con el metodo .next se guardara en la variable letter el token siguiente
//De la clase Character se utiliza el metodo toUpperCase se convierte en mayuscula, con el metodo .charAt de la clase String devuelve el valor de letter a su posicion y con el metodo substring regresa una nueva cadena que es parte de la cadena letter
			mayus = mayus + Character.toUpperCase(letter.charAt(0))+letter.substring(1)+" ";
		}
		System.out.println(mayus.trim());
	}
}
