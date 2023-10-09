/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ruben
 */
public class TipodeHabitacion {
    
    private int idTipoHabitacion;
    private int capacidad;
    private int intcantCamas;
    private String tipoCamas;
    private double precioNoche;
    private String codigo;
    private NombreHabitacion nombre;

    public TipodeHabitacion() {
    }

    public TipodeHabitacion(int capacidad, int intcantCamas, String tipoCamas, double precioNoche, NombreHabitacion nombre) {
        this.capacidad = capacidad;
        this.intcantCamas = intcantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
        this.codigo = nombre.toString();
        
    }

    public TipodeHabitacion(int idTipoHabitacion, int capacidad, int intcantCamas, String tipoCamas, double precioNoche, String codigo, NombreHabitacion nombre) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.capacidad = capacidad;
        this.intcantCamas = intcantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
       
      
    }
    
    

    public TipodeHabitacion(int idTipoHabitacion, int capacidad, int intcantCamas, String tipoCamas, double precioNoche, String codigo) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.capacidad = capacidad;
        this.intcantCamas = intcantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
        this.codigo = codigo;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getIntcantCamas() {
        return intcantCamas;
    }

    public void setIntcantCamas(int intcantCamas) {
        this.intcantCamas = intcantCamas;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "TipodeHabitacion{" + "idTipoHabitacion=" + idTipoHabitacion + ", capacidad=" + capacidad + ", intcantCamas=" + intcantCamas + ", tipoCamas=" + tipoCamas + ", precioNoche=" + precioNoche + ", codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
    
}
