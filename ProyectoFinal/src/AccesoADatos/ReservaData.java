package AccesoADatos;

import Entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            ps.setInt(7, reserva.getHabitacion().getIdHabitacion());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                reserva.setIdReserva(rs.getInt(1));
                System.out.println("Reserva Guardada Con Exito");

            } else {
                System.out.println("No se a podido Guardar su Reserva");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se a podido acceder a la tabla reserva" + ex.getMessage());

        }

    }

    public List<Reserva> obtenerReservas() {
        List<Reserva> reservas = new ArrayList<>();

        String sql = "SELECT * FROM reserva ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("IdReserva"));
                reserva.setFechaEntrada(rs.getDate("FechaEntrada").toLocalDate());
                reserva.setFechaSalida(rs.getDate("FechaSalida").toLocalDate());
                reserva.setCantidadPerso(rs.getInt("CantidadPerso"));
                reserva.setMonto(rs.getDouble("Monto"));
                reserva.setEstado(rs.getBoolean("Estado"));
                reserva.setHuesped(huespedData.buscarHuesped(rs.getInt("IdHuesped")));
                reserva.setHabitacion(habiData.buscarHabitacion(rs.getInt("IdHabitacion")));
                reservas.add(reserva);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se a podido acceder a la tabla reserva" + ex.getMessage());
        }
        return reservas;
    }

    public List<Reserva> obtenerReservaPorHuesped(int IdHuesped) {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE IdHuesped = ? ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, IdHuesped);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();

                reserva.setIdReserva(rs.getInt("IdReserva"));
                reserva.setFechaEntrada(rs.getDate("FechaEntrada").toLocalDate());
                reserva.setFechaSalida(rs.getDate("FechaSalida").toLocalDate());
                reserva.setCantidadPerso(rs.getInt("CantidadPerso"));
                reserva.setMonto(rs.getDouble("Monto"));
                reserva.setEstado(rs.getBoolean("Estado"));
                reserva.setHuesped(huespedData.buscarHuesped(rs.getInt("IdHuesped")));
                reserva.setHabitacion(habiData.buscarHabitacion(rs.getInt("IdHabitacion")));
                reservas.add(reserva);

            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se a podido acceder a la tabla reserva" + ex.getMessage());
        }
        return reservas;

    }

    public void actualizarReserva(Reserva reserva) {
        String sql = "UPDATE reserva SET FechaEntrada = ?, FechaSalida = ?, CantidadPerso = ?, Monto = ?, Estado = ? , IdHuesped = ?, IdHabitacion = ? WHERE IdReserva = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(2, Date.valueOf(reserva.getFechaSalida()));
            ps.setInt(3, reserva.getCantidadPerso());
            ps.setDouble(4, reserva.getMonto());
            ps.setBoolean(5, reserva.isEstado());
            ps.setInt(6, reserva.getHuesped().getIdHuesped());
            ps.setInt(6, reserva.getHabitacion().getIdHabitacion());
            ps.setInt(8, reserva.getIdReserva());

            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se a podido acceder a la tabla reserva" + ex.getMessage());
        }

    }

    public void eliminarReserva(int IdReserva) {
        String sql = " UPDATE reserva SET Estado = 0 WHERE IdReserva = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdReserva);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se a podido acceder a la tabla reserva" + ex.getMessage());
        }

    }

    public Reserva buscarReservaPorId(int IdReserva) {
        Reserva reserva = null;
        String sql = "SELECT * FROM reserva WHERE IdReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdReserva);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("IdReserva"));
                reserva.setFechaEntrada(rs.getDate("FechaEntrada").toLocalDate());
                reserva.setFechaSalida(rs.getDate("FechaSalida").toLocalDate());
                reserva.setCantidadPerso(rs.getInt("CantidadPerso"));
                reserva.setMonto(rs.getDouble("Monto"));
                reserva.setEstado(rs.getBoolean("Estado"));
                reserva.setHuesped(huespedData.buscarHuesped(rs.getInt("IdHuesped")));
                reserva.setHabitacion(habiData.buscarHabitacion(rs.getInt("IdHabitacion")));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se a podido acceder a la tabla reserva" + ex.getMessage());
        }

        return reserva;
    }
    public List<Reserva> obtenerReservasActivas() {
    List<Reserva> reservasActivas = new ArrayList<>();
    String sql = "SELECT * FROM reserva WHERE Estado = 1"; // Estado 1 indica reservas activas
    PreparedStatement ps;
    try {
        ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reserva reserva = new Reserva();
            reserva.setIdReserva(rs.getInt("IdReserva"));
            reserva.setFechaEntrada(rs.getDate("FechaEntrada").toLocalDate());
            reserva.setFechaSalida(rs.getDate("FechaSalida").toLocalDate());
            reserva.setCantidadPerso(rs.getInt("CantidadPerso"));
            reserva.setMonto(rs.getDouble("Monto"));
            reserva.setEstado(rs.getBoolean("Estado"));
            reserva.setHuesped(huespedData.buscarHuesped(rs.getInt("IdHuesped")));
            reserva.setHabitacion(habiData.buscarHabitacion(rs.getInt("IdHabitacion")));
            reservasActivas.add(reserva);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se ha podido acceder a la tabla reserva: " + ex.getMessage());
    }
    return reservasActivas;
}

public List<Reserva> obtenerReservasPorFechas(Date fechaInicio, Date fechaFin) {
    List<Reserva> reservasEnRango = new ArrayList<>();
    String sql = "SELECT * FROM reserva WHERE FechaEntrada <= ? AND FechaSalida >= ?";
    PreparedStatement ps;
    try {
        ps = con.prepareStatement(sql);
        ps.setDate(1, fechaFin);
        ps.setDate(2, fechaInicio);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reserva reserva = new Reserva();
            reserva.setIdReserva(rs.getInt("IdReserva"));
            reserva.setFechaEntrada(rs.getDate("FechaEntrada").toLocalDate());
            reserva.setFechaSalida(rs.getDate("FechaSalida").toLocalDate());
            reserva.setCantidadPerso(rs.getInt("CantidadPerso"));
            reserva.setMonto(rs.getDouble("Monto"));
            reserva.setEstado(rs.getBoolean("Estado"));
            reserva.setHuesped(huespedData.buscarHuesped(rs.getInt("IdHuesped")));
            reserva.setHabitacion(habiData.buscarHabitacion(rs.getInt("IdHabitacion")));
            reservasEnRango.add(reserva);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se ha podido acceder a la tabla reserva: " + ex.getMessage());
    }
    return reservasEnRango;
}


}
