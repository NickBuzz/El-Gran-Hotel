package Entidades;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.TipodeHabitacionData;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        HuespedData HD = new HuespedData();
        HabitacionData HHD = new HabitacionData(); 
        TipodeHabitacionData TDH = new TipodeHabitacionData();
        TipodeHabitacion TDH1 = new TipodeHabitacion();
        TDH.guardarTipoHabitacion(new TipodeHabitacion( 4, 2, "kingSize",  100.00, NombreHabitacion.DOBLE));
        int TDH2;
        
//        HD.guardarHuesped(new Huesped("Carlitos", 1234256, "correo@mail.com", 789456123, "domicilio"));
//        HD.guardarHuesped(new Huesped("Ana", 987654321, "ana@mail.com", 123456789, "Calle Secundaria 456"));
//        HD.guardarHuesped(new Huesped("Juan", 456789123, "juan@mail.com", 456123789, "Calle Principal 789"));
//        HD.guardarHuesped(new Huesped("Luisa", 321654987, "luisa@mail.com", 789123456, "Avenida Secundaria 987"));
//        HD.guardarHuesped(new Huesped("María", 654987321, "maria@mail.com", 321789654, "Calle Principal 567"));
//        HD.guardarHuesped(new Huesped("Pedro", 789321654, "pedro@mail.com", 987654321, "Avenida Secundaria 654"));
//        HD.guardarHuesped(new Huesped("Laura", 234567890, "laura@mail.com", 654321789, "Calle Secundaria 123"));
//        HD.guardarHuesped(new Huesped("Eduardo", 567890123, "eduardo@mail.com", 123789456, "Avenida Principal 456"));
//        HD.guardarHuesped(new Huesped("Sofía", 890123456, "sofia@mail.com", 321654987, "Calle Principal 234"));
//        HD.guardarHuesped(new Huesped("Roberto", 456789012, "roberto@mail.com", 654987321, "Calle Secundaria 789"));
//        HD.guardarHuesped(new Huesped("Roberto", 456789012, "roberto@mail.com", 654987321, "Calle Secundaria 789",true));
        List listaHuesped = HD.listarHuespedes();
        listaHuesped.forEach((Huesped) -> {
            System.out.println(Huesped.toString());
        });
//        Huesped huesped1 = HD.buscarHuespedPorDni(456789012);
//        System.out.println(huesped1.toString());
//        huesped1.setCorreo("juliancapito@mail.com");
//        HD.modificarHuesped(huesped1);
//
//        HD.eliminarHuesped(huesped1.getIdHuesped());
    int idhab;
            List listahabitacion = TDH.listarTipodeHabitaciones();
        listahabitacion.forEach((Habitaciones) -> {
         
            
            System.out.println(Habitaciones.toString());
            
        });
          
//                HHD.guardarHabitacion(new Habitacion(01, 00, 1,true,TDH1.getIdTipoHabitacion()));
                System.out.println(HHD.listarHabitaciones().toString());
        
//        HHD.guardarHabitacion(new Habitacion(01, 00, 1,true,));
//        List listaHabitacion = HHD.listarHabitaciones();
//        listaHabitacion.forEach((Habitacion) -> {
//            System.out.println(Habitacion.toString());
//        });
        
        
    }
}
