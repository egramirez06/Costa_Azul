/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

/**
 *
 * @author Student
 */
public class Cliente {
    private String nombre;
    private String identificacion;
    private String telefono;
    private String correo;
    private String pais;

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPais() {
        return pais;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cliente(String nombre, String identificacion, String telefono, String correo, String pais) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", telefono=" + telefono + ", correo=" + correo + ", pais=" + pais + '}';
    }
    
}
