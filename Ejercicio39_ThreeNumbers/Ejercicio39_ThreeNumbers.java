//Nombre: Tanya Michelle Rincon Tarango
//Dia: 22/02/19
//Hora: 8:03pm - 8:14pm

class Ejercicio39{
	public static void main(String [] args){
		int cNum = 0; //Se declara un contador de tipo entero y se inicializa en cero


		//Como es combinacion de cuatro numeros se utilizaran tres ciclos for, y cada uno ira de 1 a 4 porque son los digitos que se deben usar para las distintas combinacion
		for(int x=1; x<=4;x++){ 
			for(int y=1; y<=4;y++){
				for(int z=1; z<=4;z++){
					if(z!=x && z!=y && x!=y){ //Como son combinaciones y no se pueden repetir se revisa con este ciclo que no sean iguales 
						cNum++;	//Se incrrementa uno al contador	 
						System.out.println(x+""+y+""+z);	//Se imprime cada combinacion
					}
				}	
			}			
		}
		System.out.println("Combinaciones: "+cNum); //Al finalizar se imprime el resultado del contador
	}
}