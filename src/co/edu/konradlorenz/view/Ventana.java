package co.edu.konradlorenz.view;

import java.util.Scanner;


public class Ventana {
	
	public static Scanner leer = new Scanner(System.in);
	
	
	public static void mostrarMenu() {
	    System.out.println("===== Menú de Librería =====");
	    System.out.println("1. Mostrar Librería");
	    System.out.println("2. Crear Lista");
	    System.out.println("3. Mostrar Lista");
	    System.out.println("4. Crear Libro");
	    System.out.println("5. Salir");
	    System.out.print("Seleccione una opción: ");
	}
	


	public static String pedirString(String dato){

		System.out.println(dato);
		String opcion = leer.nextLine();
		return opcion;
	}

	public static int pedirEntero(String dato){

		System.out.println(dato);
		int opcion = leer.nextInt();
		return opcion;
	}

	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}


}
