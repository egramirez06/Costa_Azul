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

    public Habitacion(int codigo, String nombre, int capacidad, final int precioNoche, boolean disponibilidad, String estado,int numeroPiso, boolean balcon) {
        this.numeroPiso = numeroPiso;
        this.balcon = balcon;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "codigo: " + getCodigo() + "Nombre: " + getNombre() + "Capacidad: " + getCapacidad() + "Precio noceh: " + getPrecioNoche() + 
                "Disponibilidad: " + isDisponibilidad() + " estado: " + getEstado() + "numeroPiso=" + numeroPiso + ", balcon=" + balcon + '}';
    }
  
}
