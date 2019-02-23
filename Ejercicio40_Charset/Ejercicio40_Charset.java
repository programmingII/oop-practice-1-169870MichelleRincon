//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 8:21pm - 8:29pm

import java.nio.charset.Charset; //Se importa la libreria Charset que contiene los charset standar

class Ejercicio40{
	public static void main(String [] args){	
		System.out.println("Lista de caracteres disponibles en charset objetos"); //Se imprime en pantalla que es lo que se va a mostrar
		for (String str : Charset.availableCharsets().keySet()){ Dado que pueden ser muchos datos se coloca dentro de un ciclo for el cual finalizara cuando no hayan mas objetos que mostrar
			System.out.println(str); //Se imprime el contenido de str de tipo string
		}
	}
}