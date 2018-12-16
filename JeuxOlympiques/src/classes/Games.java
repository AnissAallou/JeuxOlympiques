package classes;

public enum Games {

	// constantes
	HIGHJUMP("Saut en hauteur", "Compétition", "HIGHJUMP"),
	TRIPLEJUMP("Saut en longeur", "Compétition 3 sauts en hauteur", "TRIPLEJUMP"),
	HUNDREDMETERS("100 mètres", "Course", "HUNDREDMETERS"),
	TWOHUNDREDMETERS("200 mètres", "Course", "TWOHUNDREDMETERS"),
	SHOTPUT("Lancer de poids", "Compétition", "SHOTPUT");

	// variables
	private final String nom;
	private final String presentation;
	private final String cle;
	
	// constructor 
	private Games(String nom, String presentation, String cle) {
		this.nom = nom;
		this.presentation = presentation;
		this.cle = cle;
	}

	// getters 
	
	public String getNom() {
		return nom;
	}


	public String getPresentation() {
		return presentation;
	}


	public String getCle() {
		return cle;
	}
	
	
}
