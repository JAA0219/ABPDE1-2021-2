/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Familia
 */
public class Usuarios {
    private String usuario;
    private String apellido;
    private String edad;
    private String correo;
    private String Cedula;
    private String ciudad;
    private String fecha_de_naciomiento;

    public Usuarios(String usuario, String apellido, String edad, String correo, String ciudad, String fecha_de_naciomiento, String cedula) {
        this.usuario = usuario;
        this.apellido = apellido;
        this.edad = edad;
        this.Cedula = cedula;
        this.correo = correo;
        this.ciudad = ciudad;
        this.fecha_de_naciomiento = fecha_de_naciomiento;
    }

    public Usuarios() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha_de_naciomiento() {
        return fecha_de_naciomiento;
    }

    public void setFecha_de_naciomiento(String fecha_de_naciomiento) {
        this.fecha_de_naciomiento = fecha_de_naciomiento;
    }
    
}
