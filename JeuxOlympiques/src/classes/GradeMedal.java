package classes;

public enum GradeMedal {

 	BRONZE("Medaille de BRONZE", "BRONZE"),
 	SILVER("Medaille d'ARGENT", "SILVER"),
 	GOLD("Medaille d'OR", "GOLD");
		
	// variables 
	private String medal;
	private String grade;
	
	// constructor
	private GradeMedal(String grade, String medal) {
		this.grade = grade;
		this.medal = medal;
	}

	// getters
	
	public String getGrade() {
		return grade;
	}
	
	public String getMedal() {
		return medal;
	}

	// setters 
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setMedal(String medal) {
		this.medal = medal;
	}
	
}
