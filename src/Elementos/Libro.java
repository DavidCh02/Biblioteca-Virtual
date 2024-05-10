
package Elementos;

import java.util.ArrayList;
import java.util.List;

public final class Libro extends Item {
    private String autor;
    private int numPaginas;

    public Libro(int id, String nombreItem, String tipoItem, String estadoItem) {
        super(id, nombreItem, tipoItem, estadoItem);
    }
    // Método para agregar libros
    public static List<Libro> crearLibros() {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro(1, "Cien años de soledad", "Libro", "Disponible"));
        libros.add(new Libro(2, "Don Quijote de la Mancha", "Libro", "Disponible"));
        libros.add(new Libro(3, "1984", "Libro", "Prestado"));
        return libros;
    }

    // Constructor
    public Libro(int id, String nombreItem, String estadoItem, String autor, int numPaginas) {
        super();
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Getters y setters específicos de Libro
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    // Aquí puedes agregar métodos adicionales específicos de Libro, si es necesario
}

