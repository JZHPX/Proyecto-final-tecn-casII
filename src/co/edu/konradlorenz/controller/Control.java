package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Ventana;

import java.util.ArrayList;

import co.edu.konradlorenz.model.*;


public class Control {
	
	protected Libro objLibro = new Libro();
	protected Ventana objVentana = new Ventana();
	protected Lista objLista = new Lista(null);
	protected Librero objLibrero = new Librero(0);

	
	public void run() {
		
		int opc;
		do {
			Ventana.mostrarMenu();
			opc = Ventana.pedirEntero("Introduzca una opcion:");

			switch (opc) {
			case 1:
				
				break;
			case 2:
				
				break;
				
			case 3: 
				
				break;
			case 4: 
				crearLibro();
				break;


}
		} while (opc != 5);
}
	


	
		
	
	public void acciones(int opcion) {
		
	}
	
	public void mostrarLibreria() { 
		
		if (objLibrero.almacenamiento.isEmpty()) {
	        Ventana.mostrarMensaje("La librería está vacía.");
	    } else {
	        Ventana.mostrarMensaje("Libros en la librería:");
	        for (Libro libro : objLibrero.almacenamiento) {
	            Ventana.mostrarMensaje(libro.toString());
	        }
	    }
		
	}
	
	public void crearLista() { 
			
			String nombreLista = Ventana.pedirString("Ingrese el nombre de la lista: ");
			
			objLista = new Lista(nombreLista);
			
			ArrayList<Libro> listaLibros = new ArrayList<>();

			boolean agregarMásLibros = true;

			while (agregarMásLibros) {
				crearLibro(); 
				listaLibros.add(objLibro); 
				
				String respuesta = Ventana.pedirString("¿Desea agregar otro libro a la lista? (si/no): ");
				if (!respuesta.equalsIgnoreCase("si")) {
					agregarMásLibros = false;
				}
			} 
			
			objLista.setListGuardado(listaLibros);

			Ventana.mostrarMensaje("Lista creada con éxito: " + objLista.toString());
	}
	
	public void buscarEnLista() { 
		
		String criterio = Ventana.pedirString("Ingrese el criterio de búsqueda (titulo, autor o genero):").toLowerCase();
	    String valor = Ventana.pedirString("Ingrese el valor de búsqueda:");
	    ArrayList<Libro> resultados = new ArrayList<>();

	    switch (criterio) {
	        case "titulo":
	            Libro libroPorTitulo = objLista.buscarPorTitulo(valor);
	            if (libroPorTitulo != null) {
	                resultados.add(libroPorTitulo);
	            }
	            break;
	        case "autor":
	            resultados = objLista.buscarPorAutor(valor);
	            break;
	        case "genero":
	            resultados = objLista.buscarPorGenero(valor);
	            break;
	        default:
	            Ventana.mostrarMensaje("Criterio de búsqueda no válido.");
	            return;
	    }

	    if (resultados.isEmpty()) {
	        Ventana.mostrarMensaje("No se encontraron libros con el criterio especificado.");
	    } else {
	        Ventana.mostrarMensaje("Resultados de la búsqueda:");
	        for (Libro libro : resultados) {
	            Ventana.mostrarMensaje(libro.toString());
	        }
	    }
		
	}
	
	public void buscarEnLibreria() {
		
	}
	
	public void filtrosBusqueda() {
		
	}
	
	public void agregarLibrosAlistaExistente() {
		
		String libro = Ventana.pedirString("Ingrese el titulo del libro que quiere añadir a la lista");
		objLibro = objLista.buscarPorTitulo(libro);
		
		if (objLibro != null) {
			objLista.agregarLibro(objLibro);
			Ventana.mostrarMensaje("Se agrego el libro: "+objLibro.getNombreLibro()+" a la lista: "+objLista.getNombreLista());
		}else {
			Ventana.mostrarMensaje("El libro ya esta en la lista");
		}
		
	}
	
	public void mostrarLista() {
		String lista = Ventana.pedirString("Ingrese el nombre de la lista: ").toLowerCase();
		String aux = objLista.getNombreLista().toLowerCase();
		
		if (lista.equals(aux)) {
			Ventana.mostrarMensaje("Lista: "+objLista.getNombreLista());
			Ventana.mostrarMensaje("-"+objLista.mostrarLibros());
		}else {
			Ventana.mostrarMensaje("La lista no existe");
		}
		
		
		
	}
	
	public void crearLibro(){
		 String nombre = Ventana.pedirString("Ingrese el nombre del libro: ");
	        String genero = Ventana.pedirString("Ingrese el género del libro: ");
	        String autor = Ventana.pedirString("Ingrese el autor del libro: ");
	        int annoPublicacion = Ventana.pedirEntero("Ingrese el año de publicación: ");
	        String editorial = Ventana.pedirString("Ingrese la editorial del libro: ");

	        objLibro.setNombreLibro(nombre);
	        objLibro.setGenero(genero);
	        objLibro.setAutor(autor);
	        objLibro.setAnnoPublicacion(annoPublicacion);
	        objLibro.setEditorial(editorial);

	        Ventana.mostrarMensaje("Libro creado con éxito: " + objLibro.toString());
	}
	
	public void abrirLibro() {
		
	}
	
	
}
