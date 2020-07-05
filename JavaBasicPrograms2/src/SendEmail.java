import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class SendEmail {  
 public static void main(String[] args) {  
  
  String host="smtp.gmail.com";  
  final String user="username@gmail.com";  
  final String password="Give Your Password Here"; 
  final String port = "587";
    
  String to="recipeient@gmail.com";  
  
   //Get the session object  
   Properties props = new Properties();  
   props.put("mail.smtp.host",host);  
   props.put("mail.smtp.auth", "true");
   props.put("mail.smtp.port", port);
   props.put("mail.smtp.starttls.enable", "true");
     
   Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
  
   //Compose the message  
    try {  
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("Test Mail sent using JavaMail API by Ramu");  
     message.setText("I jsu trying out sending email using JavaMail API");  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {e.printStackTrace();}  
 }  
}  