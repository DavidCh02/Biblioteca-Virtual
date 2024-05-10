package Elementos;
import java.util.ArrayList;
import java.util.List;

public class Revista extends Item {
    // Constructor
    public Revista(int id, String nombreItem, String tipoItem, String estadoItem) {
        super(id, nombreItem, tipoItem, estadoItem);
    }

    // Método para agregar revistas
    public static List<Revista> crearRevistas() {
        List<Revista> revistas = new ArrayList<>();
        revistas.add(new Revista(1, "National Geographic", "Revista", "Disponible"));
        revistas.add(new Revista(2, "Time", "Revista", "Disponible"));
        revistas.add(new Revista(3, "The Economist", "Revista", "Prestado"));
        return revistas;
    }
}
