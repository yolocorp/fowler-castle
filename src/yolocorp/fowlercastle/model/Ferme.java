package yolocorp.fowlercastle.model;

public class Ferme extends Visible {
	
	private static EtatCoffre instance;
	
	public synchronized static EtatCoffre getInstance() {
		if (instance == null) {
			instance = new Ferme();
		}
		return instance;
	}

	public void tournerChandelleVersDroite(Coffre coffre) {
		coffre.setChienEstLibere(true);
		coffre.setEtat(PresqueOuvert.getInstance());
	}
}
