
package modelo;


public class Cliente {
    private int cc;
    private String nombre;
    private int telefono;
    private String direccion;

    public int getCc() {
        return cc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Cliente(int cc, String nombre, int telefono, String direccion) {
        this.cc = cc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
}
