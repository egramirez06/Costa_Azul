/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habitaciones;
import Alojamiento.alojamientos;
/**
 *
 * @author Student
 */
public class Habitacion extends alojamientos {
    
    
    private int numeroPiso;
    private boolean balcon;

    public int getNumeroPiso() {
        return this.numeroPiso;
    } 
    public boolean isBalcon() {
        return this.balcon;
    }
    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public Habitacion(int numeroPiso, boolean balcon) {
        this.numeroPiso = numeroPiso;
        this.balcon = balcon;
    }
    
    
    
    
    
}
