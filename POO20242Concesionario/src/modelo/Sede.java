
package modelo;


public class Sede {
    private int id;
    private String direccion;
    private String nombre;

    public Sede(int id, String direccion, String nombre) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
