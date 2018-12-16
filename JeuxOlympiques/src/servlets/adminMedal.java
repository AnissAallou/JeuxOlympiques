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


import classes.Athlete;

import classes.Games;
import classes.GradeMedal;
import classes.ListAthletes;

import classes.Medal;



/**
 * Servlet implementation class manipMedailleServlet
 */
@WebServlet(urlPatterns = {"/AddMedal", "/ShowRecompense"})
public class adminMedal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminMedal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession();
		
		
		
			// si on veux rajouter une medaille a un athlete
	    if(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1).equals("AddMedal")) {
	    	
	    	// on verifie si la medaille n'a pas ete deja attribué
	    	boolean good = false;
	    	
	    for (Athlete sportifs : ListAthletes.getAthletes()) {
	    	for (Medal medal : sportifs.getMedals()) {
	    			if(medal.getGradeMedal().equals(GradeMedal.valueOf(request.getParameter("medal")))){
	    				if(medal.getGame().equals(Games.valueOf(request.getParameter("game")))) {
	    					good = true;
	    				}
	    			}
				
			}
	    }
	    	// si la medaille n'a pas deja ete attribué on la donne 
        if(good == false){
        	 for (Athlete athletes2 : ListAthletes.getAthletes()) {
				if(athletes2.getName().equals(request.getParameter("athlete"))) {
					athletes2.addMedal(new Medal(GradeMedal.valueOf(request.getParameter("medal")), (Games.valueOf(request.getParameter("game")))));
					session.setAttribute("errorAddMedal", null);
				}
			}
        	 
        }else {
        	session.setAttribute("errorAddMedal", "Cette médaille existe déjà");
        }
        System.out.println(request.getRequestURL().substring(0, request.getRequestURL().lastIndexOf("/")+1));
        	 session.setAttribute("athletes", ListAthletes.getAthletes());
        	 response.sendRedirect("http://localhost:8080/JeuxOlympiques/login");
    	}
	    
	    
	    //affichage des recompenses
	    
	    if(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1).equals("ShowRecompense")) {
	    	System.out.println("ok");
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/rewards.jsp");
			dispatcher.forward(request, response);
	    }
	    
	    
	    
	    
	    
	}

}
