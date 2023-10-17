
package Entidades;

import java.time.LocalDate;


public class Reserva {
    
    private int IdReserva;
    private LocalDate FechaEntrada;
    private LocalDate FechaSalida;
    private int CantidadPerso;
    private double Monto;
    private boolean estado;
    private Huesped huesped;
    private Habitacion habitacion;
private TipodeHabitacion tipoHabitacion;
    public Reserva() {
    }

    public Reserva(LocalDate FechaEntrada, LocalDate FechaSalida, int CantidadPerso, double Monto, boolean estado, Huesped huesped, Habitacion habitacion) {
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
        this.CantidadPerso = CantidadPerso;
        this.Monto = Monto;
        this.estado = estado;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public Reserva(int IdReserva, LocalDate FechaEntrada, LocalDate FechaSalida, int CantidadPerso, double Monto, boolean estado, Huesped huesped, Habitacion habitacion) {
        this.IdReserva = IdReserva;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
        this.CantidadPerso = CantidadPerso;
        this.Monto = Monto;
        this.estado = estado;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }
    

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int IdReserva) {
        this.IdReserva = IdReserva;
    }

    public LocalDate getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(LocalDate FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return FechaSalida;
    }

    public void setTipoHabitacion(TipodeHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setFechaSalida(LocalDate FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public int getCantidadPerso() {
        return CantidadPerso;
    }

    public void setCantidadPerso(int CantidadPerso) {
        this.CantidadPerso = CantidadPerso;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Reserva{" + "IdReserva=" + IdReserva + ", FechaEntrada=" + FechaEntrada + ", FechaSalida=" + FechaSalida + ", CantidadPerso=" + CantidadPerso + ", Monto=" + Monto + ", estado=" + estado + ", huesped=" + huesped + ", habitacion=" + habitacion + '}';
    }
    
    
    
    
}
