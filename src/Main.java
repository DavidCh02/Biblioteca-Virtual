import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        BibliotecaVirtual biblioteca = new BibliotecaVirtual("Ubicación", "Biblioteca Principal", "Política de Reserva");

        // Agregar libros, revistas y periódicos a la biblioteca
        List<Elementos.Libro> libros = Libro.crearLibros();
        biblioteca.agregarItems(libros);

        //List<Revista> revistas = Revista.crearRevistas();
        //biblioteca.agregarItems(revistas);

        //List<Periodico> periodicos = Periodico.crearPeriodicos();
        //biblioteca.agregarItems(periodicos);
        // Mostrar elementos disponibles en la biblioteca

        biblioteca.mostrarElementosDisponibles();

        // Simular interacción del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido a la Biblioteca Virtual:");
            System.out.println("1. Ver elementos disponibles");
            System.out.println("2. Solicitar Préstamo");
            System.out.println("3. Realizar Reserva");
            System.out.println("4. Salir");
            System.out.print("Ingrese el número de opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elementos disponibles en la biblioteca:");
                    biblioteca.mostrarElementosDisponibles();
                    break;
                case 2:
                    System.out.print("Ingrese el ID del elemento a solicitar préstamo: ");
                    int idPrestamo = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese su nombre: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
                    String fechaNacimientoStr = scanner.nextLine();
                    Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoStr);
                    Usuario usuario = new Usuario(1, nombreUsuario, fechaNacimiento); // Creamos un usuario con ID 1 y fecha de nacimiento
                    biblioteca.solicitarPrestamo(idPrestamo, usuario, new Date());
                    break;
                case 3:
                    System.out.print("Ingrese el ID del elemento a reservar: ");
                    int idReserva = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese su nombre: ");
                    String nombreUsuarioReserva = scanner.nextLine();
                    Usuario usuarioReserva = new Usuario(2, nombreUsuarioReserva, ""); // Creamos un usuario con ID 2 temporalmente
                    biblioteca.realizarReserva(idReserva, usuarioReserva);
                    break;
                case 4:
                    System.out.println("Gracias por usar la Biblioteca Virtual. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);
    }
}
// Clases para representar libros, revistas y periódicos
class Item {
    private int id;
    private String titulo;
    private String tipo;
    private String estado;

    public Item(int id, String titulo, String tipo, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.estado = estado;
    }

    // Getters y setters
    // ...
}

class Libro extends Item {
    public Libro(int id, String titulo, String estado) {
        super(id, titulo, "Libro", estado);
    }

    public static List<Elementos.Libro> crearLibros() {
        return List.of();
    }

    // Métodos específicos de libros
    // ...
}

class Revista extends Item {
    public Revista(int id, String titulo, String estado) {
        super(id, titulo, "Revista", estado);
    }

    public static List<Revista> crearRevistas() {
            return null;
    }

    // Métodos específicos de revistas
    // ...
}

class Periodico extends Item {
    private String fechaPublicacion;

    public Periodico(int id, String titulo, String tipo, String estado) {
        super(id, titulo, tipo, estado);
    }

    public static List<Periodico> crearPeriodicos() {
        return null;
    }
}


