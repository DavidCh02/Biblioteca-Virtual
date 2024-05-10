import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import Elementos.Item;
import Elementos.Libro;
import Elementos.Periodico;
import Elementos.Revista;

public class BibliotecaVirtual {
    public String ubicacion;
    public String nombre;
    public String politicaReserva;
    private List<Item> elementos;
    private List<Prestamo> prestamos;
    private HashSet<Reserva> reservas;

    // Constructor
    public BibliotecaVirtual(String ubicacion, String nombre, String politicaReserva) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.politicaReserva = politicaReserva;
        this.elementos = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.reservas = new HashSet<>();
    }

    // Método para agregar un nuevo item a la biblioteca
    public void agregarItem(String nombre, int id, String tipo, String estado) {
        Item nuevoItem;
        switch (tipo.toLowerCase()) {
            case "libro":
                nuevoItem = new Libro(id, nombre, estado, "", 0);
                break;
            case "periodico":
                nuevoItem = new Periodico(id, nombre, estado, "");
                break;
            case "revista":
                nuevoItem = new Revista(id, nombre, estado, "");
                break;
            default:
                System.out.println("Tipo de item no válido.");
                return;
        }
        elementos.add(nuevoItem);
        System.out.println("Item agregado a la biblioteca: " + nombre);
    }

    // Método para eliminar un item de la biblioteca basado en su ID
    public void eliminarItem(int id) {
        boolean itemFound = false;
        for (Item item : elementos) {
            if (item.getId() == id) {
                elementos.remove(item);
                System.out.println("Item eliminado de la biblioteca: " + item.getNombreItem());
                itemFound = true;
                break;
            }
        }
        if (!itemFound) {
            System.out.println("No se encontró ningún item con el ID especificado: " + id);
        }
    }


    // Método para solicitar un préstamo de un elemento
    public void solicitarPrestamo(int idElemento, Usuario usuario, Date fechaPrestamo) {
        for (Item item : elementos) {
            if (item.getId() == idElemento && item.getEstadoItem().equals("disponible")) {
                Prestamo prestamo = new Prestamo(generarIdPrestamo(), usuario, fechaPrestamo, null);
                item.setEstadoItem("prestado");
                prestamos.add(prestamo);
                System.out.println("Préstamo registrado para el elemento: " + item.getNombreItem());
                return;
            }
        }
        System.out.println("No se encontró ningún elemento disponible con el ID especificado.");
    }

    // Método para registrar la devolución de un elemento
    public void registrarDevolucion(int idPrestamo, Date fechaDevolucion) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getIdPrestamo() == idPrestamo) {
                prestamo.setFechaDevolucion(fechaDevolucion);
                for (Item item : elementos) {
                    if (item.getEstadoItem().equals("prestado") && item.getId() == prestamo.getIdItem()) {
                        item.setEstadoItem("disponible");
                        break;
                    }
                }
                System.out.println("Devolución registrada para el préstamo ID: " + idPrestamo);
                return;
            }
        }
        System.out.println("No se encontró ningún préstamo con el ID especificado.");
    }

    // Método para realizar una reserva de un elemento
    public void realizarReserva(int idElemento, Usuario usuario) {
        for (Item item : elementos) {
            if (item.getId() == idElemento && item.getEstadoItem().equals("prestado")) {
                Reserva reserva = new Reserva(generarIdReserva(), usuario, new Date());
                reservas.add(reserva);
                System.out.println("Reserva realizada para el elemento: " + item.getNombreItem());
                return;
            }
        }
        System.out.println("No se encontró ningún elemento prestado con el ID especificado.");
    }

    // Método auxiliar para generar un ID único para un préstamo
    private int generarIdPrestamo() {
        // Implementación para generar un ID único (puede variar según tus necesidades)
        return prestamos.size() + 1;
    }

    // Método auxiliar para generar un ID único para una reserva
    private int generarIdReserva() {
        // Implementación para generar un ID único (puede variar según tus necesidades)
        return reservas.size() + 1;
    }


    // Método para mostrar elementos disponibles en la biblioteca
    public void mostrarElementosDisponibles() {
        System.out.println("Elementos disponibles en la biblioteca:");
        for (Item item : elementos) {
            System.out.println(item.toString());
        }
    }


    public void agregarItems(List<Libro> items) {
        this.elementos.addAll(items);
    }
}

