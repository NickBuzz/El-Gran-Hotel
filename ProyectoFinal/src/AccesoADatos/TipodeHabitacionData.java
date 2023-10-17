/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.TipodeHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class TipodeHabitacionData {
    
    private Connection con = null;

    public TipodeHabitacionData() {
        
        con = Conexion.getConexion();
        
    }

    //cambiar precio por ID
    public void cambiarPrecio(TipodeHabitacion tipohabitacion){
        
        String sql = "UPDATE tipohabitacion SET PrecioNoche=?"
                + "WHERE IdTipoHabitacion=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, tipohabitacion.getPrecioNoche());
            ps.setInt(2, tipohabitacion.getIdTipoHabitacion());
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "precio actualizado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + ex.getMessage());
        }
        
    }
    
    //buscar tipo de habitacion por id
    public TipodeHabitacion buscarTipoHabitacion(int id) {
        TipodeHabitacion tipohabitacion = null;
        String sql = "SELECT Capacidad, CantCamas, TipoCamas, PrecioNoche, Codigo FROM tipohabitacion WHERE IdTipoHabitacion = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipohabitacion = new TipodeHabitacion();
                tipohabitacion.setIdTipoHabitacion(id);
                tipohabitacion.setCapacidad(rs.getInt("Capacidad"));                               
                tipohabitacion.setIntcantCamas(rs.getInt("CantCamas"));
                tipohabitacion.setTipoCamas(rs.getString("TipoCamas"));
                tipohabitacion.setPrecioNoche(rs.getDouble("PrecioNoche"));
                tipohabitacion.setCodigo(rs.getString("Codigo"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay un tipo de habitacion registrado con ese id");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitacion " + ex.getMessage());
        }
        return tipohabitacion;
    }
    
    //guardar tipo de habitacion
    public void guardarTipoHabitacion(TipodeHabitacion tipohabitacion) {
        String sql = "INSERT INTO tipohabitacion(Capacidad, CantCamas, TipoCamas, PrecioNoche, Codigo )"
                + "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tipohabitacion.getCapacidad());
            ps.setInt(2, tipohabitacion.getIntcantCamas());
            ps.setString(3, tipohabitacion.getTipoCamas());
            ps.setDouble(4, tipohabitacion.getPrecioNoche());
            ps.setString(5, tipohabitacion.getCodigo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                tipohabitacion.setIdTipoHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Tipo de habitacion guardado");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }

    }
    
    //eliminar tipo de habitacion por id
    public void eliminarTipodeHabitacion(int id) {

        String sql = "DELETE FROM tipohabitacion WHERE IdTipoHabitacion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito >= 1) {

                JOptionPane.showMessageDialog(null, "Tipo de habitacion borrado con exito");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitacion");
        }

    }
    
    //listado de tipo de habitacion 
    public List<TipodeHabitacion> listarTipodeHabitaciones() {

        List<TipodeHabitacion> tipodehabitaciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tipohabitacion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipodeHabitacion tipohabitacion = new TipodeHabitacion();
                tipohabitacion.setIdTipoHabitacion(rs.getInt("IdTipoHabitacion"));
                tipohabitacion.setCapacidad(rs.getInt("Capacidad"));                               
                tipohabitacion.setIntcantCamas(rs.getInt("CantCamas"));
                tipohabitacion.setTipoCamas(rs.getString("TipoCamas"));
                tipohabitacion.setPrecioNoche(rs.getDouble("PrecioNoche"));
                tipohabitacion.setCodigo(rs.getString("Codigo"));
                tipodehabitaciones.add(tipohabitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla tipo de habitacion" + ex.getMessage());
        }
        return tipodehabitaciones;
    }
    public TipodeHabitacion buscarTipoHabitacionPorNombre(String nombre) {
    TipodeHabitacion tipohabitacion = null;
    String sql = "SELECT IdTipoHabitacion, Capacidad, CantCamas, TipoCamas, PrecioNoche, Codigo FROM tipohabitacion WHERE TipoCamas = ?";
    PreparedStatement ps = null;
    
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            tipohabitacion = new TipodeHabitacion();
            tipohabitacion.setIdTipoHabitacion(rs.getInt("IdTipoHabitacion"));
            tipohabitacion.setCapacidad(rs.getInt("Capacidad"));
            tipohabitacion.setIntcantCamas(rs.getInt("CantCamas"));
            tipohabitacion.setTipoCamas(rs.getString("TipoCamas"));
            tipohabitacion.setPrecioNoche(rs.getDouble("PrecioNoche"));
            tipohabitacion.setCodigo(rs.getString("Codigo"));
        } else {
            JOptionPane.showMessageDialog(null, "No hay un tipo de habitación registrado con ese nombre.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitación: " + ex.getMessage());
    }
    
    return tipohabitacion;
}


    public TipodeHabitacion obtenerTipoDeHabitacionPorNombre(String nombre) {
        TipodeHabitacion tipodehabitacion = null;
        String sql = "SELECT * FROM tipohabitacion WHERE TipoCamas = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipodehabitacion = new TipodeHabitacion();
                tipodehabitacion.setIdTipoHabitacion(rs.getInt("IdTipoHabitacion"));
                tipodehabitacion.setCapacidad(rs.getInt("Capacidad"));
                tipodehabitacion.setIntcantCamas(rs.getInt("CantCamas"));
                tipodehabitacion.setTipoCamas(rs.getString("TipoCamas"));
                tipodehabitacion.setPrecioNoche(rs.getDouble("PrecioNoche"));
                tipodehabitacion.setCodigo(rs.getString("Codigo"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitación: " + ex.getMessage());
        }
        return tipodehabitacion;
    }
}


