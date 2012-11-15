/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Cine.Salas;

/**
 *
 * @author Daniel
 */
public class Sala3D extends SalaCine{
    private Cine_Salas.Tipo3DFormato tipo3D;
    
    public Sala3D(int filas, int sillas, int tipo){
        super(filas, sillas);
        if(tipo==1){
            this.tipo3D = Cine_Salas.Tipo3DFormato.DIGITAL;
            super.precio = 90;
        }else if(tipo == 2){
            this.tipo3D = Cine_Salas.Tipo3DFormato.REAL;
            super.precio = 110;
        }else if(tipo == 3){
            this.tipo3D = Cine_Salas.Tipo3DFormato.EXTREME;
            super.precio = 110;
        }else{
            System.out.println("Tipo no valido!");
        }
    }

    
    
}
