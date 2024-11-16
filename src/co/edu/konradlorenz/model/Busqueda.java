package co.edu.konradlorenz.model;

import java.util.ArrayList;


public interface Busqueda {
    Libro buscarPorTitulo(String titulo);
    ArrayList<Libro> buscarPorAutor(String autor);
    ArrayList<Libro> buscarPorGenero(String genero);
}
