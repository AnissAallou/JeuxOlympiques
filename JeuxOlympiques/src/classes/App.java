package classes;

public class App {

	public static void main(String[] args) {
			
		// Instanciation des athl�tes 
		Athlete sportif1 = new Athlete("Gennaro","Gattuso");
		Athlete sportif2 = new Athlete("Andrea","Pirlo");
		
		// M�daille d'or pour sportif1 au 100 m�tres 
		sportif1.addMedal(new Medal(GradeMedal.GOLD, Games.HUNDREDMETERS));
		
		
		// M�daille de bronze pour sportif2 au lancer de poids 
		sportif1.addMedal(new Medal(GradeMedal.BRONZE, Games.SHOTPUT));
		System.out.println(sportif1.toString());
		
		
		
		// Pas de m�daille pour sportif2 au saut en hauteur
		sportif2.addGame(Games.HIGHJUMP);
		// M�daille d'argent pour sportif2 a2 au lancer de poids 
		sportif2.addMedal(new Medal(GradeMedal.SILVER, Games.SHOTPUT));
		System.out.println(sportif2.toString());
		
	}

}
