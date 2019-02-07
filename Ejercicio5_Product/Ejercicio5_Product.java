//Nombre: Tanya Michelle Rincon Tarango
//Dia: 07 / 02 / 19
//Hora: 8:00pm


import java.util.Scanner; //Es la libreria que me permite ingresar datos desde consola

class Product{
	public static void main(String[] args){
		
	Scanner number=new Scanner(System.in); //Se crea el objeto number que almacenara los numeros
	int n1,n2,p; //Se crean variables para los numeros que se ingresaran y otra para el producto 

	System.out.println("Ingresa dos numeros: "); //Se muestra mensaje al usuario para que ingrese dos numeros
	n1=number.nextInt(); //Se almacena numero 1
	n2=number.nextInt(); //Se almacena numero 2

	p=n1*n2; //El programa realiza el producto
	
	System.out.println(""+n1+" * "+n2+" = "+p); //Se imprime en pantalla el resultado del producto
	}
}