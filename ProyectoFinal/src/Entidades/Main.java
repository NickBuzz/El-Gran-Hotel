
package Entidades;

import AccesoADatos.Conexion;
import AccesoADatos.HuespedData;
import java.sql.Connection;



public class Main {

   
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        HuespedData HD = new HuespedData();
        
        HD.guardarHuesped(new Huesped("Carlitos", 123456, "correo@mail.com", 789456123, "domicilio" ));
        
    }    
}
