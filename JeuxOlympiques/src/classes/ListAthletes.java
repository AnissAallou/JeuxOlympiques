package classes;

import java.util.ArrayList;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ListAthletes implements ServletContextListener {

	static ArrayList <Athlete> sportifs;
	static {
    	
		sportifs = new ArrayList<Athlete>();
    	
		sportifs.add(new Athlete("Roberto","Carlos"));
		sportifs.add(new Athlete("Cristiano","Ronaldo"));
		sportifs.add(new Athlete("Lionel","Messi"));
		sportifs.add(new Athlete("Andrea","Pirlo"));
		sportifs.add(new Athlete("Zlatan","Ibrahimovic"));
    
	}
    public ListAthletes() {
     System.out.println("Début : ");
    }
    
    // getter
    
    public static  ArrayList <Athlete> getAthletes() {
		return sportifs;	
    }
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent servletContextEvent)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent servletContextEvent)  { 
         // TODO Auto-generated method stub
    }
	
}
