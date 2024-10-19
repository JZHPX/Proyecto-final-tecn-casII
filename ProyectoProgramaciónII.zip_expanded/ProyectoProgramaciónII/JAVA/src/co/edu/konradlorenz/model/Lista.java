package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class Lista {
	
	private String nombreLista;
	private ArrayList<Libro> listaGuardado;
	
	public Lista(String nombreLista, ArrayList<Libro> listaGuardado) {
		this.nombreLista = nombreLista;
		this.listaGuardado = listaGuardado;
	}
	
	

	public Lista() {
	}


	public String getNombreLista() {
		return nombreLista;
	}

	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}

	public ArrayList<Libro> getListaGuardado() {
		return listaGuardado;
	}

	public void setListaGuardado(ArrayList<Libro> listaGuardado) {
		this.listaGuardado = listaGuardado;
	}

	@Override
	public String toString() {
		return "Lista [nombreLista=" + nombreLista + ", listaGuardado=" + listaGuardado + "]";
	}
	
	
	
	
	

}
