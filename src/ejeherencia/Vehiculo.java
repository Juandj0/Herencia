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
public abstract class Vehiculo {
    private int caballosFuerza;

    public Vehiculo(int caballosFuerza) {
        System.out.println("Constructor papa");
    }
    public void arrancar(){
        System.out.println("Arrancar");
    }
      public abstract void  detener();     
    
}
