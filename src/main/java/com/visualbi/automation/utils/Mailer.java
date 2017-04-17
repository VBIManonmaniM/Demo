package com.visualbi.automation.utils;

        import java.io.UnsupportedEncodingException;
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.*;
        import javax.mail.*;
        import javax.mail.internet.*;
        import javax.activation.*;

/**
 * Created by praveenn on 13-09-2016.
 */
public class Mailer {

    public static void mail(String buildNo,String content){

        String to="vbxautomation@visualbi.com";//change accordingly
        final String user="vbifriday@outlook.com";//change accordingly
        final String password="1Jupiter!C2";//change accordingly

        //1) get the session object
        Properties properties = System.getProperties();
        // properties.setProperty("smtp.office365.com", "mail.javatpoint.com");//change accordingly
       properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.host", "smtp-mail.outlook.com");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user,password);
                    }
                });

        //2) compose message
        try{
            MimeMessage message = new MimeMessage(session);
            try {
                message.setFrom(new InternetAddress(user,"VBX Friday"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            Calendar cal = Calendar.getInstance();
            Date date = cal.getTime();
            TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
            DateFormat dateFormatDateFolderName= new SimpleDateFormat("MMM dd yyyy");
            dateFormatDateFolderName.setTimeZone(istTimeZone);
            String now = dateFormatDateFolderName.format(date);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Automation Test Report –  "+now);

            //3) create MimeBodyPart object and set your message content
            BodyPart messageBodyPart1 = new MimeBodyPart();
            messageBodyPart1.setContent(content, "text/html; charset=utf-8");

            //4) create new MimeBodyPart object and set DataHandler object to this object



            //5) create Multipart object and add MimeBodyPart objects to this object
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart1);


            //6) set the multiplart object to the message object
            message.setContent(multipart );

            //7) send message
            Transport.send(message);

            System.out.println("message sent....");
        }catch (MessagingException ex) {ex.printStackTrace();}
    }
}

