/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;

import Alojamiento.alojamientos;
import clientes.Cliente;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Student
 */
public class Reservacion {
    protected Cliente clientes;
    protected alojamientos alojamiento;
    protected LocalDate fechaIngreso;
    protected LocalDate fechaSalida;
    protected estadoReserva estadoReserva;

    public Cliente getClientes() {
        return clientes;
    }

    public alojamientos getAlojamiento() {
        return alojamiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public estadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setAlojamiento(alojamientos alojamiento) {
        this.alojamiento = alojamiento;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setEstadoReserva(estadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Reservacion(Cliente clientes, alojamientos alojamiento, LocalDate fechaIngreso, LocalDate fechaSalida, estadoReserva estadoReserva) {
        this.clientes = clientes;
        this.alojamiento = alojamiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estadoReserva = estadoReserva;
    }
    public int calcularNochesReserva(){
        return Period.between(fechaIngreso, fechaSalida).getDays();
    }

    @Override
    public String toString() {
        return "Reservacion: " + "clientes: " + clientes + "\nalojamiento: " + alojamiento + "\nfechaIngreso: " + fechaIngreso + "\nfechaSalida: " + fechaSalida + "\nestadoReserva:" + estadoReserva;
    }
    
    
}
