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
public class Registro {
    private String usuario;
    private String apellido;
    private String edad;
    private String correo;
    private String cedula;
    private String Password; 

    public Registro(String usuario, String apellido, String edad, String correo, String Password, String cedula) {
        this.usuario = usuario;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.cedula = cedula;
        this.Password = Password; 
    }

    public Registro() {
    }

    public Object getCorreo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     



}


