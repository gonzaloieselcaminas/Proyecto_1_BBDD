package com.example.proyecto_1_bbdd;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;


public class MandarCorreo {

    public static void mandarCorreo(String[] destinatarios, String asignatura) {
        if (destinatarios.length == 0) {return;}

        // El correo gmail de envío
        String correoEnvia = "auto.correo.notas@gmail.com";
        String claveCorreo = "utcm ptzl imte cgzn ";

        // La configuración para enviar correo
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.user", correoEnvia);
        properties.put("mail.password", claveCorreo);

        // Obtener la sesion
        Session session = Session.getInstance(properties, null);

        try {
            // Crear el cuerpo del mensaje
            MimeMessage mimeMessage = new MimeMessage(session);

            // Agregar quien envía el correo
            mimeMessage.setFrom(new InternetAddress(correoEnvia));

            // Los destinatarios

            InternetAddress[] internetAddresses = new InternetAddress[destinatarios.length];
            for (int i = 0; i < destinatarios.length; i++) {
                internetAddresses[i] = new InternetAddress(destinatarios[i]);
            }

            // Agregar los destinatarios al mensaje
            mimeMessage.setRecipients(Message.RecipientType.TO,
                    internetAddresses);

            // Agregar el asunto al correo
            mimeMessage.setSubject("Actualización de notas");

            // Creo la parte del mensaje
            MimeBodyPart htmlPart = new MimeBodyPart();
            String htmlContent = "Se ha actualizado la nota de " + asignatura;
            htmlPart.setContent(htmlContent, "text/html");

            // Crear el multipart para agregar la parte del mensaje anterior
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(htmlPart);

            // Agregar el multipart al cuerpo del mensaje
            mimeMessage.setContent(multipart);

            // Enviar el mensaje
            Transport transport = session.getTransport("smtp");
            transport.connect(correoEnvia, claveCorreo);
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
            transport.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Acabo de enviar un correo desde " + correoEnvia);
    }

    public static void main(String[] args) {
        String[] destinatarios = {"lopezdetroya@gmail.com", "alusan9143@ieselcaminas.org"};
        MandarCorreo.mandarCorreo(destinatarios, "Matemáticas");
    }
}