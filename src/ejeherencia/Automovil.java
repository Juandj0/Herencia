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
public  class Automovil extends Vehiculo{
    private int cantidadPuertas;

    public Automovil(int caballosFuerza,int cantidadPuertas) {
        super(caballosFuerza);
        
        
        this.cantidadPuertas=cantidadPuertas;
      
    }
    public void acelerar(int cuanto){
     System.out.println("acelerar");
    }
    @Override
    public void arrancar(){
    System.out.println("Arrancado en rayo piscualin");
    }

    @Override
    public void detener() {
        
    }
    
}
