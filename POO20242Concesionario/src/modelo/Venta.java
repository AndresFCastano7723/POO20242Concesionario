
package modelo;

import vista.Presentacion;
import java.util.ArrayList;

public class Venta {
    private String fecha;
    private Cliente cli;
    private Vehiculo veh;
    private double Total;
    ArrayList<Vehiculo> lisAux=new ArrayList<Vehiculo>();

    public Venta(String fecha, double Total) {
        this.fecha = fecha;
        this.Total=Total;
    }
    
    public Cliente crearCliente(){
        Presentacion ob=new Presentacion();
        int ced=ob.pedirEntero("ingrese la cedula del cliente");
        String n=ob.pedirInfo("Ingrese nombre del cliente");
        int tel=ob.pedirEntero("Ingrese Telefono");
        String dic=ob.pedirInfo("ingrese direccion");
        cli=new Cliente(ced,n,tel,dic);
        return cli;
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCli() {
        return cli;
    }

    public Vehiculo getVeh() {
        return veh;
    }

    public double getTotal() {
        return Total;
    }

    public void setLisAux(ArrayList<Vehiculo> lisAux) {
        this.lisAux = lisAux;
    }
   
    public ArrayList<Vehiculo> getLista(){
        return lisAux;
    }
    
    
    
}
