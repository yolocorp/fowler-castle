
public class Cache extends EtatCoffre{
	
	public void oterLivre(Coffre coffre) {
		coffre.setEtat(new Ferme());
	}

}
