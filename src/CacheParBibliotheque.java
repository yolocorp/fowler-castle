
public class CacheParBibliotheque extends EtatCoffre{
	
	private static EtatCoffre instance;
	
	public synchronized static EtatCoffre getInstance() {
		if (instance == null) {
			instance = new CacheParBibliotheque();
		}
		return instance;
	}
	
	public void oterLivre(Coffre coffre) {
		coffre.setEtat(Ferme.getInstance());
	}

}
