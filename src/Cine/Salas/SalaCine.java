/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Salas;

/**
 *
 * @author Daniel
 */
public class SalaCine extends Sillas{
    protected int codigoC, filas, sillas;
    protected double precio;
    
    
    public SalaCine(int filas, int sillas){
        super(true,false);
        this.filas = filas;
        this.sillas = sillas;
        this.codigoC++;
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
