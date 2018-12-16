package classes;

public enum Games {

	// constantes
	HIGHJUMP("Saut en hauteur", "Comp�tition", "HIGHJUMP"),
	TRIPLEJUMP("Saut en longeur", "Comp�tition 3 sauts en hauteur", "TRIPLEJUMP"),
	HUNDREDMETERS("100 m�tres", "Course", "HUNDREDMETERS"),
	TWOHUNDREDMETERS("200 m�tres", "Course", "TWOHUNDREDMETERS"),
	SHOTPUT("Lancer de poids", "Comp�tition", "SHOTPUT");

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
