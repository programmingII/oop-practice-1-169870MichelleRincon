//Nombre: Tanya Michelle Rincon Tarango
//Dia: 13/02/19
//Hora: 8:40pm - 9:12pm

import java.util.Scanner; //Se importa la libreria para escanear

class Ejercicio19{

    public static void main(String[] args) {

        int Num, Exp, Dig; //Se crean tres variables de tipo entero
        double Binario; //Se crea una variable de tipo double
        Scanner bin = new Scanner(System.in); //Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre "bin"

        do{   //Se inicia ciclo do while
            System.out.printf("Introduce un numero entero decimal: "); //Se pide al usuario que ingrese un numero entero
            Num = bin.nextInt(); //Se almacena numero entero en la variable Num
        }while(Num<0); //El ciclo se va a repetir siempre que Num sea menor que cero

        Exp=0; //Se inicializa la variable Exp=Exponente a cero, porque para convertir siempre se inicia en cero
        Binario=0; //Se inicializa nuestro resultado binario a cero porque aun no tenemos ningun dato almacenado

        while(Num!=0){ //Se crea ciclo while que se cumplira siempre que Num sea diferente de cero
                Dig = Num % 2; //Para convertir el cada digito es dividido entre dos y el residuo se almacena en la variable digito
                Binario = Binario + Dig * Math.pow(10, Exp);   	//El numero binario esta conformado por la union del mismo binario, el digito almacenado que es 									//multiplicado por 10 elevado al numero que almacena la variable exponente
                Exp++; //Se incrementa un valor a la variable exponente
                Num = Num/2; //En Num se almacena el mismo numero que queda entre 2
        }
        System.out.printf("Binario: %.0f ", Binario); //Se imprime el numero binario almacenado en Binario, se coloca un .0 en donde se colocara el numero para que no muestre decimales
    }
}