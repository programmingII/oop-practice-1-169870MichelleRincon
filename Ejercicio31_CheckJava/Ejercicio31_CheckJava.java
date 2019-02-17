//Nombre: Tanya Michelle Rincon Tarango
//Dia: 16/02/19
//Hora: 9:49pm - 10:04pm

class Ejercicio31{
	public static void main(String[] args){
		/*De la clase System se utiliza el metodo getProperty se utilizan los siguientes objetos 
		de los cuales su nombre esta relacionados con la funcion que hacen cada uno. 
		Se utiliza println para que cada cosa que se imprima comience en nueva linea */
		System.out.println("Java Version: "+System.getProperty("java.version")); 
		System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		System.out.println("Java Home: "+System.getProperty("java.home"));
		System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
	}
}