/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeherencia;

/**
 *
 * @author Estudiante
 */
public class Ejeherencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo v;
        
       
        Automovil a=new Automovil(10,20);
        a.acelerar(10);
        a.arrancar();
        a.detener();
      
    }
    
}
