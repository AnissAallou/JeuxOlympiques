package servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/deconnection")
public class logOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public logOut() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    // méthode GET
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession sessionUser = request.getSession();
		 sessionUser.invalidate();
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
	}
	

	// méthode POST
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
