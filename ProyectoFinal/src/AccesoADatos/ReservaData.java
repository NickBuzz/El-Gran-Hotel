package AccesoADatos;

import Entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;
    private HuespedData huespedData = new HuespedData();
    private HabitacionData habiData = new HabitacionData();

    public ReservaData() {
        con = Conexion.getConexion();

    }

    public void guardarReserva(Reserva reserva) {
        String sql = "INSERT INTO reserva(FechaEntrada,FechaSalida,CantidadPerso,Monto,Estado,IdHuesped,IdHabitacion) VALUES (?,?,?,?,?,?,?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(2, Date.valueOf(reserva.getFechaSalida()));
            ps.setInt(3, reserva.getCantidadPerso());
            ps.setDouble(4, reserva.getMonto());
            ps.setBoolean(5, reserva.isEstado());
            ps.setInt(6, reserva.getHuesped().getIdHuesped());
            ps.setInt(7, reserva.getHabitaciones().getIdHabitaciones());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                reserva.setIdReserva(1);
                System.out.println("Reserva Guardada Con Exito");

            } else {
                System.out.println("No se a podido Guardar su Reserva");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se a podido acceder a la tabla reserva" + ex.getMessage());

        }

    }
    public List<Reserva> obtenerReservas(){
        
    }
public List<Reserva> obtenerReservaPorHuesped (int id){
    
}
}
