
package modelo;


public class Validaciones {
    
    public boolean validarPrecio(double p){
        return p>10000000;
    }
    
    public boolean validarTamano(int t){
        return t>0;
    }
    
}
