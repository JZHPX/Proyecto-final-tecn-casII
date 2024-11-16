package co.edu.konradlorenz.model;

import java.util.ArrayList;


public abstract class ColeccionLibros implements Busqueda {
    public ArrayList<Libro> almacenamiento = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        almacenamiento.add(libro);
    }

    public Libro mostrarLibros() {
        for (Libro libro : almacenamiento) {
            return libro;
        }
        return null;
    }

    @Override
    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : almacenamiento) {
            if (libro.getNombreLibro().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : almacenamiento) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    @Override
    public ArrayList<Libro> buscarPorGenero(String genero) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : almacenamiento) {
            if (libro.getGenero().equalsIgnoreCase(genero)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }
}
