package co.edu.konradlorenz.model;

public class Libro {
	
	private String nombreLibro;
	private String genero;
	private String autor;
	private int annoPublicacion;
	private String editorial;
	
	
	public Libro(String nombreLibro, String genero, String autor, int annoPublicacion, String editorial) {
		this.nombreLibro = nombreLibro;
		this.genero = genero;
		this.autor = autor;
		this.annoPublicacion = annoPublicacion;
		this.editorial = editorial;
	}
	
	

	public Libro() {

	}



	public String getNombreLibro() {
		return nombreLibro;
	}
	
	public void setNombreLibro(String nombreLibro) {
		
		this.nombreLibro = nombreLibro;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnnoPublicacion() {
		return annoPublicacion;

	}
	
	public void setAnnoPublicacion(int annoPublicacion) {
		this.annoPublicacion = annoPublicacion;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	@Override
	public String toString() {
		return "Libro [nombreLibro=" + nombreLibro + ", genero=" + genero + ", autor=" + autor + ", annoPublicacion="
				+ annoPublicacion + ", editorial=" + editorial + "]";
	}
	
	

}
