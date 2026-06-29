/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cabana;

import Alojamiento.alojamientos;

/**
 *
 * @author Student
 */
public class cabanas extends alojamientos{
      protected double tamaño;
    protected final double impuesto =13/100;
    protected String piscina;
    protected double mCuadrados;
    protected double precioTOT;
    protected final double cantNoches;

    public double getTamaño() {
        return tamaño;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public String getPiscina() {
        return piscina;
    }

    public double getmCuadrados() {
        return mCuadrados;
    }

    public double getPrecioTOT() {
        return precioTOT;
    }

      @Override
    public int getPrecioNoche() {
        return precioNoche;
    }

   

    
    
    public cabanas(double tamaño, String piscina, double mCuadrados, double precioTOT, double cantNoches1) {
        this.tamaño = tamaño;
        this.piscina = piscina;
        this.mCuadrados = mCuadrados;
        this.precioTOT = precioTOT;
          this.cantNoches = cantNoches1;
          
    }
    
    public void cabanaTam(){
        if(mCuadrados>=80){
            System.out.print("Cabaña amplia");
           
        }else {
            System.out.print("Cabaña no amplia");
        }      
    }
    
   public void precioTotal(){
       for(int i = 0; i>cantNoches; i++){
           precioTOT= getPrecioNoche() * cantNoches;
       }
       
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
