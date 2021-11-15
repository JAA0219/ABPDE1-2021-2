/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correo;


import Conector.Conector;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Familia
 */
public class Acc {
    
    String correo, contrasena, nom, dest, subject, msn, rout;
    JTextField destinatario, asunto, ruta;
    JTextArea mensaje;
    JLabel estado;
    String[] vect;

    public Acc(String valor1, String valor2, JTextField valor3, JTextField valor4, JTextArea valor5, JTextField valor6, String valor7, JLabel valor8) {
        this.correo = valor1;
        this.contrasena = valor2;
        this.destinatario = valor3;
        this.asunto = valor4;
        this.mensaje = valor5;
        this.ruta = valor6;
        this.nom = valor7;
        this.estado = valor8;
        dest = destinatario.getText();
        subject = asunto.getText();
        msn = mensaje.getText();
        rout = ruta.getText();
        vect = dest.split(";");
    }
    
    Acc(String correo, String contrasena, JTextField para, JTextField asunto, JTextArea texto, JLabel ruta, String nom, JLabel label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void run() {
        if (rout.equals("")) {

            final String usuario = correo;
            final String pass = contrasena;
            Properties props = new Properties();

            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.live.com");
            props.put("mail.smtp.socketFactory.port", "587");
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(usuario, pass);
                        }
                    });
            session.setDebug(false);

            try {
                estado.setText("Enviando Mensaje");
                for (int i = 0; i < vect.length; i++) {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(usuario));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(vect[i]));
                    message.setSubject(subject);
                    message.setText(msn);
                    Transport.send(message);
                    Conector objeto = new Conector(correo,vect[i],subject);
                }
                estado.setText("Mensaje enviado");
                mensaje.setText("");
                asunto.setText("");
                destinatario.setText("");
            } catch (MessagingException e) {
                estado.setText("Error al enviar mensaje");
                JOptionPane.showMessageDialog(null, "Algo salio mal compruebe la conexion a internet");
            }
        } else {

            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.live.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props);
            session.setDebug(false);
            BodyPart texto = new MimeBodyPart();

          try {
                estado.setText("Enviando Mensaje");
                for (int i = 0; i < vect.length; i++) {
                    texto.setText(msn);
                    BodyPart adjunto = new MimeBodyPart();
                    adjunto.setDataHandler(new DataHandler(new FileDataSource(rout)));
                    adjunto.setFileName(nom);
                    MimeMultipart multiParte = new MimeMultipart();
                    multiParte.addBodyPart(texto);
                    multiParte.addBodyPart(adjunto);
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(correo));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(vect[i]));
                    message.setSubject(subject);
                    message.setContent(multiParte);
                    Transport t = null;
                    t = session.getTransport("smtp");
                    t.connect(correo, contrasena);
                    t.sendMessage(message, message.getAllRecipients());
                    t.close();
                }
                estado.setText("Mensaje enviado");
                mensaje.setText("");
                asunto.setText("");
                destinatario.setText("");
                ruta.setText("");
                ruta.setVisible(false);
                
            } catch (MessagingException ex) {
                estado.setText("Error al enviar mensaje");
                JOptionPane.showMessageDialog(null, "Algo salio mal compruebe la conexion a internet");
            }
        }
    }

    public void start() {
        new Thread((Runnable) this).start();
    }
}

    