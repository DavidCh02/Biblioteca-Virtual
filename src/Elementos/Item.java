package Elementos;

public class Item {
    public int id;
    public String nombreItem;
    public String tipoItem;
    public String estadoItem;

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombreItem + ", Tipo: " + tipoItem + ", Estado: " + estadoItem;
    }
    // Constructor
    public Item(int id, String nombreItem, String tipoItem, String estadoItem) {
        this.id = id;
        this.nombreItem = nombreItem;
        this.tipoItem = tipoItem;
        this.estadoItem = estadoItem;
    }

    public Item() {

    }

    // Método para agregar un nuevo item
    public String AgregarItem() {
        // Aquí puedes agregar la lógica para agregar un nuevo item
        return "Item agregado exitosamente";
    }

    // Método para eliminar un item
    public void EliminarItem() {
        // Aquí puedes agregar la lógica para eliminar un item
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getEstadoItem() {
        return estadoItem;
    }

    public void setEstadoItem(String estadoItem) {
        this.estadoItem = estadoItem;
    }
}
