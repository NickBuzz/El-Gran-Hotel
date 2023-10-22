/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Habitacion;
import Entidades.TipodeHabitacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class HabitacionData {
    
    TipodeHabitacionData tipoDeHabitacionData = new TipodeHabitacionData();
    private Connection con = null;

    public HabitacionData() {
        con = Conexion.getConexion();
    }

    public void guardarHabitacion(Habitacion habitacion) {
        String sql = "INSERT INTO habitaciones(numero, piso, estado, IdTipoHabitacion) "
                + "VALUES (?, ?, ?, ?)";
        
        try {
               PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
           
          System.out.println(  habitacion.getIdTipoHabitacion() +" idtdh-"+ habitacion.getNumero()+"-"+habitacion.getPiso()+"-"+ habitacion.isEstado());
            ps.setInt(1, habitacion.getNumero());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.isEstado()?1:0);
            ps.setInt(4, habitacion.getIdTipoHabitacion());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitacion nueva guardada con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion en habitaciondata.guardarHabitacion: " + ex.getMessage() + " ." );
            ex.printStackTrace();
        }
    }

    public void modificarHabitacion(Habitacion habitacion) {
        String sql = " UPDATE habitaciones SET numero =?, piso =?, estado =?, IdTipoHabitacion =? "
                + " WHERE IdHabitacion =?";
        try {
            System.out.println(habitacion.getIdHabitacion()+" id -" + habitacion.getIdTipoHabitacion() +"idtdh-"+ habitacion.getNumero()+"-"+habitacion.getPiso()+"-"+ habitacion.isEstado());
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getNumero());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.isEstado()?1:0);
           ps.setInt(4, habitacion.getIdTipoHabitacion());
           ps.setInt(5, habitacion.getIdHabitacion());
        
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Habitacion acutalizada con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + ex.getMessage());
        }
    }

   public void eliminarHabitacion(int id) {
        String sql = "UPDATE habitaciones SET estado = 0 WHERE IdHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Habitacion borrada con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones");
        }

    }
    
    public Habitacion buscarHabitacion(int id) {
        Habitacion habitacion = null;
        String sql = "SELECT IdHabitacion, numero, piso, estado, IdTipoHabitacion FROM habitaciones WHERE IdHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));                               
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setIdTDHabitacion(tipoDeHabitacionData.buscarTipoHabitacion(rs.getInt("IdTipoHabitacion")));
                habitacion.setIdTipoHabitacion(rs.getInt("IdTipoHabitacion"));
                System.out.println(habitacion.getPiso() + "piso");
           
                
            
            } else {
                JOptionPane.showMessageDialog(null, "No hay un habitacion registrada con ese id");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());
        }
        return habitacion;
    }

    public Habitacion buscarHabitacionPorNumero(int numero) {
        Habitacion habitacion = null;
        String sql = "SELECT idHabitacion, numero, piso, estado, IdTipoHabitacion FROM habitaciones WHERE numero = ? ";
        PreparedStatement ps = null;
       
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));    
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setIdTDHabitacion(tipoDeHabitacionData.buscarTipoHabitacion(rs.getInt("IdTipoHabitacion")));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la habitacion con ese numero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones " + ex.getMessage());
        }
        return habitacion;
    }
    
    public List<Habitacion> listarHabitaciones() {
        List<Habitacion> habitaciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM habitaciones";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setEstado(rs.getBoolean("estado"));         
                habitacion.setIdTDHabitacion(tipoDeHabitacionData.buscarTipoHabitacion(rs.getInt("IdTipoHabitacion")));
        
                habitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla huesped " + ex.getMessage());
        }
        return habitaciones;
    }
public List<Habitacion> obtenerTipoHabitacion(int idTipoHabitacion){
    List<Habitacion> habitaciones = new ArrayList<>();
    String sql=" SELECT * FROM habitaciones WHERE idTipoHabitacion = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTipoHabitacion);
           ResultSet rs= ps.executeQuery();
           while(rs.next()){
               Habitacion habitacion =new Habitacion ();
               habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
               habitacion.setNumero(rs.getInt("numero"));
               habitacion.setPiso(rs.getInt("piso"));
               habitacion.setEstado(rs.getBoolean("estado"));
               habitacion.setIdTDHabitacion(tipoDeHabitacionData .buscarTipoHabitacion(rs.getInt("idTipoHabitacion")));
               habitaciones.add(habitacion);
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla habitacion."+ex.getMessage());
        }
        return habitaciones;
}


 public List<Habitacion> obtenerHabitacionesDisponibles(int idTipoHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
    List<Habitacion> habitacionesDisponibles = new ArrayList<>();
    String sql = "SELECT * FROM habitacion WHERE estado = true AND idTipoHabitacion = ? AND IdHabitacion NOT IN ("
                 + "SELECT IdHabitacion FROM reserva WHERE (FechaEntrada BETWEEN ? AND ?) OR (FechaSalida BETWEEN ? AND ?))";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, idTipoHabitacion);
        ps.setDate(2, Date.valueOf(fechaEntrada));
        ps.setDate(3, Date.valueOf(fechaSalida));
        ps.setDate(4, Date.valueOf(fechaEntrada));
        ps.setDate(5, Date.valueOf(fechaSalida));
        
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                habitacion.setNumero(rs.getInt("Numero"));
                habitacion.setPiso(rs.getInt("Piso"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setIdTDHabitacion(tipoDeHabitacionData.buscarTipoHabitacion(rs.getInt("idTipoHabitacion")));

                habitacionesDisponibles.add(habitacion);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion: " + ex.getMessage());
    }

    return habitacionesDisponibles;
}

    }


    
    

