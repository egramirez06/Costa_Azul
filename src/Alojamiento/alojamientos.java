/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alojamiento;

/**
 *
 * @author Student
 */
public class alojamientos {
     protected int codigo;
    protected String nombre;
    protected int capacidad;
    protected final int precioNoche = 100;
    protected boolean disponibilidad;
    protected String estado;
    

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public String getEstado() {
        return estado;
    }
    
}
