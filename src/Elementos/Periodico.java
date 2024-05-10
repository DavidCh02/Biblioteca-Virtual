package Elementos;

import java.util.ArrayList;
import java.util.List;

public class Periodico extends Item {
    private String fechaPublicacion;

    // Constructor
    public Periodico(int id, String nombreItem, String tipoItem, String estadoItem) {
        super(id, nombreItem, tipoItem, estadoItem);
    }

    // Constructor con fecha de publicación
    public Periodico(int id, String nombreItem, String tipoItem, String estadoItem, String fechaPublicacion) {
        super(id, nombreItem, tipoItem, estadoItem);
        this.fechaPublicacion = fechaPublicacion;
    }

    // Método para crear una lista de periódicos
    public static List<Periodico> crearPeriodicos() {
        List<Periodico> periodicos = new ArrayList<>();
        periodicos.add(new Periodico(1, "El País", "Periódico", "Disponible"));
        periodicos.add(new Periodico(2, "The New York Times", "Periódico", "Disponible"));
        periodicos.add(new Periodico(3, "The Guardian", "Periódico", "Prestado", "2024-05-09")); // Se agregó la fecha de publicación
        return periodicos;
    }

    // Getters y setters específicos de Periodico
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    // Aquí puedes agregar métodos adicionales específicos de Periodico, si es necesario
}
