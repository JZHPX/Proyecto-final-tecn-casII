package co.edu.konradlorenz.model;

import java.util.ArrayList;


public class Librero {
	
	private int numeroSeccion;
	private ArrayList<Libro> almacenamiento;
	
	public Librero(int numeroSeccion, ArrayList<Libro> almacenamiento) {
		this.numeroSeccion = numeroSeccion;
		this.almacenamiento = almacenamiento;
	}
	
	
	public Librero() {

	}


	public int getNumeroSeccion() {
		return numeroSeccion;
	}

	public void setNumeroSeccion(int numeroSeccion) {
		this.numeroSeccion = numeroSeccion;
	}

	public ArrayList<Libro> getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(ArrayList<Libro> almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String toString() {
		return "Librero [numeroSeccion=" + numeroSeccion + ", almacenamiento=" + almacenamiento + "]";
	}
	
	
	

	
	
	
	

}
