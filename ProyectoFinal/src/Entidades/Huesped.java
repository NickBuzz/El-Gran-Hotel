
package Entidades;

public class Huesped {
    private int IdHuesped;
    private String nombre;
    private int dni;
    private String correo;
    private int celular;
    private String domicilio;

    public Huesped() {
    }

    public Huesped(int IdHuesped, String nombre, int dni, String correo, int celular, String domicilio) {
        this.IdHuesped = IdHuesped;
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.domicilio = domicilio;
    }

    public Huesped(String nombre, int dni, String correo, int celular, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.domicilio = domicilio;
    }

    public int getIdHuesped() {
        return IdHuesped;
    }

    public void setIdHuesped(int IdHuesped) {
        this.IdHuesped = IdHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Huesped{" + "IdHuesped=" + IdHuesped + ", nombre=" + nombre + ", dni=" + dni + ", correo=" + correo + ", celular=" + celular + ", domicilio=" + domicilio + '}';
    }
    
    
    
}
