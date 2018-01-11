
public class Ouvert extends EtatCoffre {

	public void fermerCoffre (Coffre coffre) {
		coffre.setEtat(new Ferme());
	}
	
}
