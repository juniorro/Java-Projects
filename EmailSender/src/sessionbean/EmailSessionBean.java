package sessionbean;

import java.util.Properties;

import javax.ejb.Stateless;
import javax.websocket.Session;

import sun.rmi.transport.Transport;

import javax.mail.Message;



@Stateless
public class EmailSessionBean {
	
	public void SendEmail (String emailTo, String emailFrom, String emailSubject, 
			String message, String username, String password) {
		
		try {
			Properties properties = System.getProperties();
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			properties.put("mail.smtp.socketFactory.port", "465");
			properties.put("mail.smtp.socketFactory.fallback", "false");
			
			Session emailSession = Session.getDefaultInstance(properties, null);
			emailSession.setDebug(true);
			Message emailMessage = new MimeMessage(emailSession);
			
			emailMessage.setForm(new InternetAddress(emailFrom));
			emailMessage.setRecepient(Message.Recipient.TO, new InternetAddress(emailTo));
			emailMessage.setContent(message, "text/html");
			emailMessage.setSubject(emailSubject);
			
			Transport transport = emailSession.getTransport("smtp");
			transport.connect("smtp.gmail.com", username, password);
			transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
