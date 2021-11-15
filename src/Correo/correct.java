/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correo;

import APP1.Login;
import java.net.PasswordAuthentication;
import java.security.NoSuchProviderException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Familia
 */
public class correct {
    
    JTextField usuario;
    JPasswordField contrasena;
    JLabel error;
    Login jlogin;
    String user, passs;

    public correct(JTextField valor1, JPasswordField valor2, JLabel valor3, Login valor4) {
        this.usuario = valor1;
        this.contrasena = valor2;
        this.error = valor3;
        this.jlogin = valor4;
        user = usuario.getText();
        passs = contrasena.getText();

    }
    
     correct (JTextField user, JTextField contra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    correct(JTextField user, JTextField contra, APP1.Login aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void run() {
        Properties props = new Properties();

        final String usuario = user;
        final String pass = passs;

        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.live.com");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        
         Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(usuario, pass);
                    }
                });
        session.setDebug(false);

        Transport transport = null;

        try {
            transport = session.getTransport("smtp");
        } catch (javax.mail.NoSuchProviderException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             transport.connect();
            error.setVisible(false);
            jlogin.setVisible(false);
            Dashboard objeto = new Dashboard(user, passs);
            objeto.setVisible(true);
        } catch (MessagingException ex) {
            error.setVisible(true);
            contrasena.setText("");
        }
    }

    private static class dashboard {

        public dashboard() {
        }
    }
     public void start() {
        new Thread((Runnable) this).start();
    }

    private static class Login {

        public Login() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Dashboard {

        private Dashboard(String user, String passs) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Dashboard() {
        }

        
        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}

        

