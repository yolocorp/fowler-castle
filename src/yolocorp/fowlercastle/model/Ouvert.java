package yolocorp.fowlercastle.model;

public class Ouvert extends EtatCoffre {
	
	private static EtatCoffre instance;
	
	public synchronized static EtatCoffre getInstance() {
		if (instance == null) {
			instance = new Ouvert();
		}
		return instance;
	}

	public void fermerCoffre (Coffre coffre) {
		coffre.setEtat(Ferme.getInstance());
	}
	
}
