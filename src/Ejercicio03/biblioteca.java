package Ejercicio03;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
  public List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void prestarLibro(String título) {
        for (Libro libro : libros) {
            if (libro.getTítulo().equalsIgnoreCase(título)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("No se encontró ningún libro con el título '" + título + "'.");
    }

    public void devolverLibro(String título) {
        for (Libro libro : libros) {
            if (libro.getTítulo().equalsIgnoreCase(título)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("No se encontró ningún libro con el título '" + título + "'.");
    }

    public void buscarLibros(String consulta) {
        for (Libro libro : libros) {
            if (libro.getTítulo().toLowerCase().contains(consulta.toLowerCase()) ||
                    libro.getAutor().toLowerCase().contains(consulta.toLowerCase())) {
                System.out.println("Título: " + libro.getTítulo() +
                        ", Autor: " + libro.getAutor() +
                        ", Disponible: " + libro.estáDisponible());
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("1984", "George Orwell");
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);

        miBiblioteca.prestarLibro("1984");
        miBiblioteca.devolverLibro("Cien años de soledad");
        miBiblioteca.buscarLibros("soledad");
    }
}