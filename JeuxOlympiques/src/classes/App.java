package classes;

public class App {

	public static void main(String[] args) {
			
		// Instanciation des athlètes 
		Athlete sportif1 = new Athlete("Gennaro","Gattuso");
		Athlete sportif2 = new Athlete("Andrea","Pirlo");
		
		// Médaille d'or pour sportif1 au 100 mètres 
		sportif1.addMedal(new Medal(GradeMedal.GOLD, Games.HUNDREDMETERS));
		
		
		// Médaille de bronze pour sportif2 au lancer de poids 
		sportif1.addMedal(new Medal(GradeMedal.BRONZE, Games.SHOTPUT));
		System.out.println(sportif1.toString());
		
		
		
		// Pas de médaille pour sportif2 au saut en hauteur
		sportif2.addGame(Games.HIGHJUMP);
		// Médaille d'argent pour sportif2 a2 au lancer de poids 
		sportif2.addMedal(new Medal(GradeMedal.SILVER, Games.SHOTPUT));
		System.out.println(sportif2.toString());
		
	}

}
