/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;
import habitaciones.Habitacion;
/**
 *
 * @author Student
 */
public class CalculoHabitacion {
    private Habitacion[] habitacion;
    
    public boolean calcularHabitaionDisponible(boolean disponible){
        for(int i = 0;i < habitacion.length; i++){
        if(habitacion[i] != null){
            if(habitacion[i].isDisponibilidad()==disponible){
                return true;
            }
        }
            }
        return false;
    }
   
    
    
    
    
}
