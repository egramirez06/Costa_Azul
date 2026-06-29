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
      protected String tamaño;
    protected final double impuesto =13/100;
    protected boolean piscina ;
    protected double mCuadrados;
    protected double precioTOT;
    protected double precioIva;
    protected double cantNoches;

    public String getTamaño() {
        return tamaño;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public boolean getPiscina() {
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

    public double getPrecioIva() {
        return precioIva;
    }

    public double getCantNoches() {
        return cantNoches;
    }

   

    
    
    public cabanas(String tamaño, boolean piscina, double mCuadrados, double precioTOT, double cantNoches1) {
        this.tamaño = tamaño;
        this.piscina = piscina;
        this.mCuadrados = mCuadrados;
        this.precioTOT = precioTOT;
          this.cantNoches = cantNoches1;
          
    }
    
    public String cabanaTam(){
        if(mCuadrados>=80){
           System.out.print("Cabaña amplia");
           
        }else {
            System.out.print("Cabaña no amplia");
        }   
      return tamaño;
    }
    
   public double precioTotal(){
       for(int i = 0; i>cantNoches; i++){
           
           precioTOT= getPrecioNoche() * cantNoches;
           break;
           
       }
       precioIva= impuesto*precioTOT;
       return precioIva;
   }

   public boolean hayPiscina(){
       if (piscina=true){
             System.out.print(" Si ");
       }
       return piscina;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    @Override
    public String toString() {
        return "cabanas{ tamaño=" + tamaño +
                " /n impuesto=" +  impuesto +
                "/n Cabaña posee piscina=" +
                piscina +  "/n Sub-total sin impuesto=" + 
                precioTOT + "/n Total con impuesto=" + 
                precioIva + "/n cantidad de noches=" +
                cantNoches + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            }
