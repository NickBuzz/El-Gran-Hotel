/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Habitacion {
    
    private int IdHabitacion;
    private int numero;
    private int piso;
    private boolean estado;
    private TipodeHabitacion IdTDHabitacion;
    private int idTipoHabitacion;
    
    public Habitacion (){}

    public Habitacion(int IdHabitacion, int numero, int piso, boolean estado, int idTipoHabitacion) {
        this.IdHabitacion = IdHabitacion;
        this.numero = numero;
        this.piso = piso;
        this.estado = estado;
        this.idTipoHabitacion= idTipoHabitacion;
    }
    
     public Habitacion( int numero, int piso, boolean estado, int idTipoHabitacion ) {
         this.IdHabitacion = IdHabitacion;
        this.numero = numero;
        this.piso = piso;
        this.estado = estado;
         this.idTipoHabitacion= idTipoHabitacion;
           
    }
     
    

    public int getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(int IdHabitacion) {
        this.IdHabitacion = IdHabitacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public TipodeHabitacion getIdTDHabitacion() {
        return IdTDHabitacion;
    }

    public void setIdTDHabitacion(TipodeHabitacion IdTDHabitacion) {
        this.IdTDHabitacion = IdTDHabitacion;
    }

  



    @Override
    public String toString() {
        return "Habitacion{" + "IdHabitacion=" + IdHabitacion + ", numero=" + numero + ", piso=" + piso + ", estado=" + estado + ", TipoDeHabitacion=" + IdTDHabitacion + '}';
    }
    
    
    
    
    
    
}
