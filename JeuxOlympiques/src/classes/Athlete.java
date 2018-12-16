package classes;
import java.util.ArrayList;

import java.util.List;

public class Athlete {
	private String lastName;
	private String firstName;
	
	// register to zero game
	private List<Games> games = new ArrayList<>();
	// none medal
	private List <Medal> medals = new ArrayList<Medal>();
	
	
	public Athlete() {
		
	}
	
	
	public Athlete(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public Athlete(String lastName, String firstName, List<Games> games, List<Medal> medal) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.games = games;
		this.medals = medal;
	}


	public String getName() {
		return lastName;
	}


	public void setName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public List<Games> getGames() {
		return games;
	}


	public void setGames(List<Games> games) {
		this.games = games;
	}


	public List<Medal> getMedals() {
		return medals;
	}


	public void setMedals(List<Medal> medal) {
		this.medals = medal;
	}
	
	public void addMedal(Medal medal) {
		this.medals.add(medal);
		this.games.add(medal.getGame());
		// En ajoutant une médaile a un athlète on lui ajoute le game
		// pour lequel il remporte la reward
	}
	
	public void addGame(Games game) {
		this.games.add(game);
	}
	

	@Override
	public String toString() {
	String info = "Athlète : " + lastName + " " + firstName + " joue à :\n";
	for (Games game : games) {
		Boolean gagner = false; // Si le booléen est à false pour ce game 
		// l'athlète a joué à ce game mais il n'a pas gagné de reward
		info += "- "	+ game.getNom() + " (" + game.getPresentation() + ")" ;

		for (Medal medal : medals) {
			if(game.getNom().equals(medal.getGame().getNom())){
				gagner = true; // Si le nom du game de la reward correspond au nom du game 
				// on affiche son résultat et on détermine le booléen à Vrai
				info +=  " remporte la " + medal.getGradeMedal().getGrade() + " \n";
			}
		}
		if(!gagner) {
			info += " et n'a pas remporté de médaille\n";
		}
		
	}
	return info;
				
	}


	
	
	
	
	
	
	
	
}
