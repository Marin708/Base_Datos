package Ejercicio03;

class Libro {
    private String título;
    private String autor;
    private boolean disponible;

    public Libro(String título, String autor) {
        this.título = título;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estáDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + título + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + título + "' no está disponible para préstamo.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + título + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + título + "' ya estaba disponible.");
        }
    }
}