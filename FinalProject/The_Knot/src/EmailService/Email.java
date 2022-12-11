/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmailService;
import User.CoupleUser;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 

/**
 *
 * @author athipathi
 */
public class Email {
    
     private final static String system_mail="knot1610@gmail.com";
    private final static String system_mail_pwd="ysxyebfkcmupvhdk";
    private final static String reg_Subject="Account Created Successfully";
     Session session;
    public void setProperties(){
     Properties properties = new Properties ();
           properties.put("mail.smtp.host", "smtp.gmail.com");
           properties.put("mail.smtp.socketFactory.port", "465"); //SSL Port
            properties.put("mail.smtp.socketFactory.class",
                            "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
            properties.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
            properties.put("mail.smtp.port", "465");
           
            session= Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
               protected  PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(system_mail,system_mail_pwd);
               }
           });}
    public void sendWelcomeMail(CoupleUser user){
          setProperties();
           try{
            MimeMessage message = new MimeMessage (session) ;
            message. setFrom (new InternetAddress (system_mail));
            message.addRecipient (Message. RecipientType.TO, new InternetAddress (user.getEmail()));
            message.setSubject (reg_Subject);
            message.setText ("Welcome to The Knot\n Your Account has been Created\n"+ user.getName()+" and "+ user.getPartnerName()+" Congrats on getting Engaged..");
            Transport.send(message);
            System.out.println("Email Sent");
            } catch (Exception ex) {
            //System.out.println(""+ex);
            }           
    }
}
