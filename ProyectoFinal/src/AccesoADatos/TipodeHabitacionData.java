/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.TipodeHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
}
