/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Salas;

/**
 *
 * @author Daniel
 */
public class SalaCine {
    protected int sillas, filas, codigoC;
    protected double precio;
    protected boolean activado, ocupado;
    
    public SalaCine(int sillas, int filas){
        this.filas=filas;
        this.sillas=sillas;
        this.codigoC++;
        this.ocupado=false;
        this.activado=true;
    }
}
