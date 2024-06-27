/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import vista.Presentacion;

/**
 *
 * @author Estudiante
 */
public class Venta {
    private String fecha;
    private Cliente cl;
    private Vehiculo vh;
    private double total;
    ArrayList<Vehiculo> liAux= new ArrayList<Vehiculo>();

    public void setLiAux(ArrayList<Vehiculo> liAux) {
        this.liAux = liAux;
    }

    public ArrayList<Vehiculo> getLiAux() {
        return liAux;
    }
    
    public String getFecha() {
        return fecha;
    }

    public Cliente getCl() {
        return cl;
    }

    public Vehiculo getVh() {
        return vh;
    }

    public double getTotal() {
        return total;
    }

    public Venta(String fecha, ArrayList<Vehiculo> vh, double total) {
        this.fecha = fecha;
        this.vh = vh;
        this.total = total;
    }

    public void crearCliente(){
        Presentacion vw = new Presentacion();
        int ced=vw.pedirEntero("ingrese la cedula del cliente");
        String n=vw.pedirInfo("Ingrese nombre del cliente");
        int tel=vw.pedirEntero("Ingrese Telefono");
        String dic=vw.pedirInfo("ingrese direccion");
        cl = new Cliente(ced,tel,n,dic);
    }
    
    
}
