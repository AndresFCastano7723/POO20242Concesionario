

package modelo;

import vista.Presentacion;
import java.util.ArrayList;


public class Consecionario {
    private int Nit;
    private String nombre;
  ArrayList<Empleado> empleados = new ArrayList<Empleado>();  
  ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();    
  ArrayList<Sede> sedes = new ArrayList<Sede>();  
  ArrayList<Venta> ventas = new ArrayList<Venta>();
  Presentacion in=new Presentacion();
 
 
    public Consecionario(int Nit, String nombre) {
        this.Nit = Nit;
        this.nombre = nombre;
    }
  
    public void crearEmpleado(){
        int cc,res;
        String n,car;
        do{
         cc= in.pedirEntero("ingrese la cedula del empleado");
         n=in.pedirInfo("ingrese el nombre del empleado");
         car=in.pedirInfo("ingrese el cargo del empleado");
         Empleado em=new Empleado(cc,n,car);
         empleados.add(em);
         res= in.pedirEntero("Para ingresar empleado 1 sino otro valor");
        }while(res==1);
    }
    
    public void crearSede(){
        int id,res;
        String n,dir;
        do{
         id= in.pedirEntero("ingrese el id de la sede");
         n=in.pedirInfo("ingrese el nombre de la sede");
         dir=in.pedirInfo("ingrese la direccion de la sede");
         Sede se=new Sede(id,dir,n);
         sedes.add(se);
         res= in.pedirEntero("Para ingresar sede 1 sino otro valor");
        }while(res==1);
    }
    
    
    public void crearVehiculo(){
        int id,res,mod;
        String ma,car;
        double pre;
        Validaciones v=new Validaciones();
        do{
         id= in.pedirEntero("ingrese codigo del vehiculo");
         ma=in.pedirInfo("ingrese la marca del vehiculo");
         mod=in.pedirEntero("ingrese el modelo del vehiculo");
         do{
         pre=in.pedirDecimales("ingrese el precio del vehiculo");
         }while(!v.validarPrecio(pre));
         
         Vehiculo veh=new Vehiculo(id,ma,mod,pre);
         vehiculos.add(veh);
         res= in.pedirEntero("Para ingresar vehiculo 1 sino otro valor");
        }while(res==1);
    }
    
    public void mostrarVehiculos(){
        int a=1;
        String men="esta es la lista de vehiculos \n";
        for (Vehiculo vehiculo : vehiculos) {
            men+=a+"  "+vehiculo.getId()+"\t"+vehiculo.getMarca()+"\t"+vehiculo.getModelo()+
                    "\t"+vehiculo.getPrecio()+"\n";
        a++;
        }
        in.mostrarRes(men);
    }
    
   
    public void realizarVenta(){
        ArrayList<Vehiculo> aux=new ArrayList<Vehiculo>();
      
        //Cliente cli=null;
        String fe;
        int ind;
        double acu=0;
        int res=in.pedirEntero("si llega cliente 1 sino otro valor");
        while(res==1){
            mostrarVehiculos();
            ind=in.pedirEntero("Seleccione vehiculo a comprar");
            acu+=vehiculos.get(ind-1).getPrecio();
            aux.add(vehiculos.get(ind-1));
            vehiculos.remove(ind-1);
            res=in.pedirEntero("Para comprar otro vehiculo 1 sino otro valor");
        }
        fe=in.pedirInfo("ingrese fecha");
        Venta ven=new Venta(fe,acu);
        ven.crearCliente();
        ven.setLisAux(aux);
        ventas.add(ven);
    }
  
    public void mostrarVentas(){
        ArrayList<Vehiculo> lisaux=new ArrayList<Vehiculo>();
        lisaux=null;
        String men="las ventas realizados son: \n";
        for(Venta v:ventas){
            men+="fecha: "+ v.getFecha()+"\n"+
            "cedula cliente: "+v.getCli().getCc()+"\n"+
            "nombre cliente: "+v.getCli().getNombre()+"\n";
            lisaux=v.getLista();
            for(Vehiculo lveh:lisaux){
                men+="marca vehiculo: "+ lveh.getMarca()+"\n"+
                 "modelo vehiculo: "+ lveh.getModelo()+"\n"+        
                 "precio vehiculo: "+ lveh.getPrecio()+"\n";
            }        
           men+="Total Pagado: "+ v.getTotal();
                    
        }
       in.mostrarRes(men);
    }
    
    
}
