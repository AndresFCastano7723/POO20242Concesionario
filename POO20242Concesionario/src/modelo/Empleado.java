

package modelo;

public class Empleado {
    private int cc;
    private String nombres;
    private String cargo;

    public Empleado(int cc, String nombres, String cargo) {
        this.cc = cc;
        this.nombres = nombres;
        this.cargo = cargo;
    }

    public int getCc() {
        return cc;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCargo() {
        return cargo;
    }
    
    
    
}
