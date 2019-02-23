//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 8:46pm - 9:04pm

import java.util.Scanner; //Se importa la libreria que nos permite almacenar datos

class Ejercicio42{
	public static void main(String [] args){
		Scanner cad = new Scanner (System.in);
	
		String pass="abc@123", access;
		int x=0;
		
		do{
			System.out.println("Ingresa tu password");
			access = cad.nextLine();
			
			if(access == pass){
				x=1;
			} else {
				x=0;
			}
		} while(x==1);
	}
}