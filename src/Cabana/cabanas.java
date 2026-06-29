/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cabana;

/**
 *
 * @author Student
 */
public class cabanas {
      protected double tamaño;
    protected final double impuesto =13/100;
    protected String piscina;
    protected double mCuadrados;
    protected double precioTOT;
    protected final double cantNoches = 20;

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

    public cabanas(double tamaño, String piscina, double mCuadrados, double precioTOT) {
        this.tamaño = tamaño;
        this.piscina = piscina;
        this.mCuadrados = mCuadrados;
        this.precioTOT = precioTOT;
    }
    
    public void cabanaTam(){
        if(mCuadrados>=80){
            System.out.print("Cabaña amplia");
           
        }else {
            System.out.print("Cabaña no amplia");
        }      
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
