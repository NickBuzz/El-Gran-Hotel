package AccesoADatos;

import Entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
    }

    public void guardarHuesped(Huesped huesped) {
        String sql = "INSERT INTO huesped(nombre, dni, correo, celular, domicilio, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setInt(2, huesped.getDni());
            ps.setString(3, huesped.getCorreo());
            ps.setInt(4, huesped.getCelular());
            ps.setString(5, huesped.getDomicilio());
            ps.setInt(6, huesped.isEstado()?1:0);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }
    }

    public void modificarHuesped(Huesped huesped) {
        String sql = "UPDATE huesped SET nombre =?, dni =?, correo =?, celular =?, domicilio =?, estado =? "
                + "WHERE IdHuesped =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huesped.getNombre());
            ps.setInt(2, huesped.getDni());
            ps.setString(3, huesped.getCorreo());
            ps.setInt(4, huesped.getCelular());
            ps.setString(5, huesped.getDomicilio());
            ps.setInt(6, huesped.isEstado()?1:0);
            ps.setInt(7, huesped.getIdHuesped());
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Huesped acutalizado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + ex.getMessage());
        }
    }

   public void eliminarHuesped(int id) {
        String sql = "UPDATE huesped SET estado = 0 WHERE IdHuesped = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Huesped borrado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }

    }
    
    public Huesped buscarHuesped(int id) {
        Huesped huesped = null;
        String sql = "SELECT nombre, dni, correo, celular, domicilio, estado FROM huesped WHERE IdHuesped = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(id);
                huesped.setNombre(rs.getString("nombre"));                               
                huesped.setDni(rs.getInt("dni"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay un huesped registrado con ese id");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped " + ex.getMessage());
        }
        return huesped;
    }

    public Huesped buscarHuespedPorDni(int dni) {
        Huesped huesped = null;
        String sql = "SELECT idHuesped, nombre, dni, correo, celular, domicilio, estado FROM huesped WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("IdHuesped"));
                huesped.setNombre(rs.getString("nombre"));                               
                huesped.setDni(rs.getInt("dni"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el huesped");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped " + ex.getMessage());
        }
        return huesped;
    }
    
    public List<Huesped> listarHuespedes() {
        List<Huesped> huespedes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM huesped";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Huesped huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("IdHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setCorreo(rs.getString("correo"));                
                huesped.setCelular(rs.getInt("celular"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setEstado(rs.getBoolean("estado"));
                huespedes.add(huesped);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla huesped " + ex.getMessage());
        }
        return huespedes;
    }
}
