//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 9:48am - 9:57am

import java.util.Scanner; //Se importa la libreria para escanear

class Ejercicio18{

    public static void main(String[] args) {

        Scanner bin=new Scanner(System.in); //Se crea el objeto en el que se almacenaran datos
	String b1, b2, prod; //Se declaran tres variables de tipo String

	System.out.println("Ingresa dos numeros binarios"); //Se pide al usuario que ingrese dos numeros binarios
	b1=bin.nextLine(); //Se almacena el primer binario en la variable b1
	b2=bin.nextLine(); //Se almacena el segundo binario en la variable b2

 	prod=(Integer.toBinaryString(Integer.parseInt(b1, 2)*Integer.parseInt(b2, 2))); ////Se utiliza la clase integer con sus objetos parseInt y toBinaryString, el primero cambiara las cadenas a enteros con los cuales se hara la operacion se suma y con el segunto se convertira de nuevo a cadena binaria

	System.out.println(""+b1+" * "+b2+" = "+prod); //Se imprime el resultado de la multiplicacion
    }
}