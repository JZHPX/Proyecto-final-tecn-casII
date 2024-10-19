package co.edu.konradlorenz.view;

import java.util.Scanner;


public class Ventana {
	
	public static Scanner leer = new Scanner(System.in);
	


	public static String pedirString(String dato){

		System.out.println(dato);
		String opcion = leer.nextLine();
		return opcion;
	}

	public static long pedirLong(){

		return 0;

	}

	public static int pedirEntero(String dato){

		System.out.println(dato);
		int opcion = leer.nextInt();
		return opcion;
	}




}
