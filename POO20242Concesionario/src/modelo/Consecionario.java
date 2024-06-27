package modelo;

import java.util.ArrayList;
import vista.Presentacion;

public class Consecionario {

    Presentacion vw = new Presentacion()
    private int nit;
    private String nombre;
    ArrayList<Empleado> empleado = new ArrayList<Empleado>();
    ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
    ArrayList<Sede> sede = new ArrayList<Sede>();
    ArrayList<Venta> venta = new ArrayList<Venta>();

    public Consecionario(int nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }

    public void crearEmpleado() {
        int id, res;
        String n, car;

        do {
            id = vw.pedirEntero("Ingrese la cedula del empleado");
            n = vw.pedirInfo("Ingrese nombre del empleado");
            car = vw.pedirInfo("Ingrese cargo del empleado");
            Empleado em = new Empleado(id, n, car);
            empleado.add(em);
            res = vw.pedirEntero("1. Para ingresar nuevo empleado\n0. Para terminar proceso");
        } while (res == 1);
    }

    public void crearSede() {
        int id, res;
        String n, dir;

        do {
            id = vw.pedirEntero("Ingrese la cedula del empleado");
            n = vw.pedirInfo("Ingrese nombre del empleado");
            dir = vw.pedirInfo("Ingrese cargo del empleado");
            Sede sd = new Sede(id, dir, n);
            sede.add(sd);
            res = vw.pedirEntero("1. Para ingresar nueva sede\n0. Para terminar proceso");
        } while (res == 1);
    }

    public void crearSede() {
        int id, res;
        String n, dir;

        do {
            id = vw.pedirEntero("Ingrese la cedula del empleado");
            n = vw.pedirInfo("Ingrese nombre del empleado");
            dir = vw.pedirInfo("Ingrese cargo del empleado");
            Sede sd = new Sede(id, dir, n);
            sede.add(sd);
            res = vw.pedirEntero("1. Para ingresar nueva sede\n0. Para terminar proceso");
        } while (res == 1);
    }

    public void crearVehiculo() {
        int id, mod, res;
        String mrc;
        double pr;

        do {
            id = vw.pedirEntero("Ingrese la cedula del empleado");
            mod = vw.pedirEntero("Ingrese año del modelo");
            mrc = vw.pedirInfo("Ingrese cargo del empleado");
            pr = vw.pedirDecimales("Ingrese precio del vehiculo");
            Vehiculo vh = new Vehiculo(id, mod, mrc, pr);
            vehiculo.add(vh);
            res = vw.pedirEntero("1. Para ingresar nuevo vehiculo\n0. Para terminar proceso");
        } while (res == 1);
    }

    public void mostrarVehiculos() {
        int a = 1;
        String msg = "Lista de vehiculos\n";
        for (Vehiculo vehiculo : vehiculo) {
            msg += a + ". " + vehiculo.getId() + "\t" + vehiculo.getMarca() + "\t" + vehiculo.getModelo() + "\t" + vehiculo.getPrecio() + "\n";
            a++;
        }
        vw.mostrarRes(msg);
    }

    public void realizarVenta() {
        String fe;
        ArrayList<Vehiculo> aux = null;
        int ind;
        double ac = 0;
        int res = vw.pedirEntero("1.Para nueva venta.\n0.Para terminar.");
        while (res == 1) {
            mostrarVehiculos();
            ind = vw.pedirEntero("Seleccione vehiculo a comprar");
            ac += vehiculo.get(ind - 1).getPrecio();
            aux.add(vehiculo.get(ind - 1));
            vehiculo.remove(ind - 1);
            res = vw.pedirEntero("1.Para seguir comprando\n0.Para terminar");
        }
        fe = vw.pedirInfo("Ingrese fecha");
        Venta ven = new Venta(fe, aux, ac);
        ven.crearCliente();
        venta.add(ven);
    }

    public void mostrarVentas() {
        liaux=null;
        String msg = "Ventas: \n";
        for (Venta v : venta) {
            msg += "\tFecha: " + v.getFecha() + "\n" + "\tID cliente: " + v.getCl().getId() +"\n" + "\tNombre cliente: " + v.getCl().getNombre();//+ "\n" + "\tMarca Vehiculo: " + v.getVh().getMarca() + "\n" + "\tModelo Vehiculo: " + v.getVh().getModelo();
            liaux=v.getLiAux()
            for()
        }
    }

}
