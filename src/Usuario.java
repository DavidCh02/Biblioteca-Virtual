import java.util.Date;

public class Usuario {
        private int cedula;
        private String nombre;
        private String direccion;

        // Constructor
        public Usuario(int cedula, String nombre, Date direccion) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.direccion = String.valueOf(direccion);
        }

    public Usuario(int cedula, String nombreUsuarioReserva, String s) {

    }

    // Método para obtener información de un item
        public String ObtenerInfomacionItem() {
            // Aquí puedes agregar la lógica para obtener información sobre un item
            return "Información sobre el item";
        }

        // Getters y setters
        public int getCedula() {
            return cedula;
        }

        public void setCedula(int cedula) {
            this.cedula = cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }
