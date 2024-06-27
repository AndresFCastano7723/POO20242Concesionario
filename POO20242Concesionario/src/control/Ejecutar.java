package control;

import modelo.Consecionario;
import vista.Presentacion;

public class Ejecutar {

    public static void main(String[] args) {
        Presentacion vw = new Presentacion();
        int nit=vw.pedirEntero("Ingrese el nit de la empresa:");
        String n = vw.pedirInfo("Ingrese el nombre de la empresa: ");
        Consecionario cs = new Consecionario(nit, n);
        cs.crearEmpleado();
        cs.crearSede();
        cs.crearVehiculo();
        cs.mostrarVehiculos();
        cs.realizarVenta();
        cs.mostrarVentas();
    }
}
