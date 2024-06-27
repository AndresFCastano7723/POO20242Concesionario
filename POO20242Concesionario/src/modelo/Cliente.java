package modelo;

public class Cliente {

    private int id, telefono;
    private String nombre, direccion;

    public int getId() {
        return id;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente(int id, int telefono, String nombre, String direccion) {
        this.id = id;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
    }

}
