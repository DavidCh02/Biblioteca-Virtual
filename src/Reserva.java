import java.util.Date;

public class Reserva {
    public int idReserva;
    public String usuarioSolicita;
    public Date fechaReserva;

    // Constructor
    public Reserva(int idReserva, Usuario usuarioSolicita, Date fechaReserva) {
        this.idReserva = idReserva;
        this.usuarioSolicita = String.valueOf(usuarioSolicita);
        this.fechaReserva = fechaReserva;
    }

    // Getters y setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getUsuarioSolicita() {
        return usuarioSolicita;
    }

    public void setUsuarioSolicita(String usuarioSolicita) {
        this.usuarioSolicita = usuarioSolicita;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
