/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Sede {
    private int id;
    private String direccion, nombre;

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
    
    public Sede(int id, String direccion, String nombre) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
    }

}
