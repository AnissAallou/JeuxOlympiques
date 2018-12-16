package servlets;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import classes.Games;
import classes.GradeMedal;
import classes.ListAthletes;




/**
 * Servlet implementation class servlet_main
 */
@WebServlet(urlPatterns = {"/login"})
public class root extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

    public root() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession userSession = request.getSession();
	    userSession.setAttribute("athletes", ListAthletes.getAthletes());
	
		if(userSession.getAttribute("pseudo") == null) {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}else {
	  		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/authenticate.jsp");
	  		dispatcher.forward(request, response);
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
	    HttpSession session = request.getSession();
        System.out.println(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1));
//	    		si la session existe ou si il se connect avec les bonne valeurs
   
        
        
	    if( request.getParameter("userName").equals("admin") &&  request.getParameter("password").equals("password")) {
	    	
	   
		    	session.setAttribute("pseudo", request.getParameter("userName"));
		    	session.setAttribute("password", request.getParameter("password"));
		    	

		 
		    	
		    	
		    	Games[] games = Games.values();
		    	session.setAttribute("Games", games);
		    	
		    	GradeMedal[] medals = GradeMedal.values();
		    	session.setAttribute("Medals", medals);
		
		    	session.setAttribute("erreur", null);
	  		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/authenticate.jsp");
	  		dispatcher.forward(request, response);

      
	    }
	    else if(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1).equals("AddMedal")) {
	    		
	    	}
	    else {
	      	session.setAttribute("erreur", "Pseudo ou Password incorrect");
	    	response.sendRedirect("http://localhost:8080/JeuxOlympiques/login");
	  
	    }
	    
	    
	}

}
