//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 9:39am - 

import java.util.Scanner; //Se importa la libreria para escanear

class Ejercicio17{

    public static void main(String[] args) {

        Scanner bin=new Scanner(System.in);
	String b1, b2, sum;

	System.out.println("Ingresa dos numeros binarios");
	b1=bin.nextLine();
	b2=bin.nextLine();

	sum=(Integer.toBinaryString(Integer.parseInt(b1, 2)+Integer.parseInt(b2, 2)));

	System.out.println(""+b1+" + "+b2+" = "+sum);
    }
}