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
		// En ajoutant une m�daile a un athl�te on lui ajoute le game
		// pour lequel il remporte la reward
	}
	
	public void addGame(Games game) {
		this.games.add(game);
	}
	

	@Override
	public String toString() {
	String info = "Athl�te : " + lastName + " " + firstName + " joue � :\n";
	for (Games game : games) {
		Boolean gagner = false; // Si le bool�en est � false pour ce game 
		// l'athl�te a jou� � ce game mais il n'a pas gagn� de reward
		info += "- "	+ game.getNom() + " (" + game.getPresentation() + ")" ;

		for (Medal medal : medals) {
			if(game.getNom().equals(medal.getGame().getNom())){
				gagner = true; // Si le nom du game de la reward correspond au nom du game 
				// on affiche son r�sultat et on d�termine le bool�en � Vrai
				info +=  " remporte la " + medal.getGradeMedal().getGrade() + " \n";
			}
		}
		if(!gagner) {
			info += " et n'a pas remport� de m�daille\n";
		}
		
	}
	return info;
				
	}


	
	
	
	
	
	
	
	
}
