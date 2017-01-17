package webinterface;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sessionbean.EmailSessionBean;


@WebServlet (name = "ControllerServlet", urlPatterns = {"/ControllerServlet"})

public class ControllerServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	
	@EJB
	private EmailSessionBean emailSender;
       
	
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
	}

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	response.setContentType("text/html;charset=UTF-8");
    	
    	String emailTo = request.getParameter("email");
    	String emailSubject = request.getParameter("subject");
    	String emailMessage = request.getParameter("message");
    	
    	//Set Properties for mail server 
    	
    	String emailFrom = "rolandjuniortoussaint@gmail.com";
    	String username = "rolandjuniortoussaint";
    	String password = "N99google1";
    	
    	emailSender.SendEmail(emailTo, emailFrom, emailSubject, emailMessage, username, password);
    	
    	
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
