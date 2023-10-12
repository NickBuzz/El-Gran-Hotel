
package Entidades;

public class huesped {
    private int IdHuesped;
    private String nombre;
    private int dni;
    private String correo;
    private long celular;
    private String domicilio;
    private boolean estado;

    public huesped() {
    }

    public huesped(int IdHuesped, String nombre, int dni, String correo, long celular, String domicilio, boolean estado) {
        this.IdHuesped = IdHuesped;
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public huesped(String nombre, int dni, String correo, long celular, String domicilio, boolean estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.domicilio = domicilio;
        this.estado = estado;
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

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Huesped{" + "IdHuesped=" + IdHuesped + ", nombre=" + nombre + ", dni=" + dni + ", correo=" + correo + ", celular=" + celular + ", domicilio=" + domicilio + ", estado=" + estado + '}';
    }

    
    
    
}
