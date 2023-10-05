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

    public void cambiarPrecio(TipodeHabitacion tipohabitacion){
        
        String sql = "UPDATE tipohabitacion SET PrecioNoche=?"
                + "WHERE codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, tipohabitacion.getPrecioNoche());
            ps.setString(2, tipohabitacion.getCodigo());
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "precio acutalizado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + ex.getMessage());
        }
        
    }
    
    public TipodeHabitacion buscarTipoHabitacion(int id) {
        TipodeHabitacion tipohabitacion = null;
        String sql = "SELECT Capacidad, CantCamas, TipoCamas, PrecioNoche, Codigo FROM tipohabitacion WHERE IdTipoHabitacion = ?";
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
                tipohabitacion.setPrecioNoche(rs.getInt("PrecioNoche"));
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
    
}
