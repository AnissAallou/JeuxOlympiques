package classes;

public class Medal {
	
	
	private GradeMedal gradeMedal;
	private Games game;
	
	public Medal(GradeMedal gradeMedal, Games game) {
		this.gradeMedal = gradeMedal;
		this.game = game;
	}

	// getters 
	
	public GradeMedal getGradeMedal() {
		return gradeMedal;
	}
	
	public Games getGame() {
		return game;
	}

	// setters 
	
	public void setGradeMedal(GradeMedal gradeMedal) {
		this.gradeMedal = gradeMedal;
	}

	public void setGame(Games game) {
		this.game = game;
	}
	
	
	
}
