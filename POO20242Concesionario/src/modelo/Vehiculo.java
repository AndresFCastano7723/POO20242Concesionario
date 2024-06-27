            /*
             * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
             * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Vehiculo {

    private int id, modelo;
    private String marca;
    private double precio;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public int getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public Vehiculo(int id, int modelo, String marca, double precio) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }
}
