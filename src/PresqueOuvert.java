
public class PresqueOuvert extends Visible {

	private static EtatCoffre instance;
	
	public synchronized static EtatCoffre getInstance() {
		if (instance == null) {
			instance = new PresqueOuvert();
		}
		return instance;
	}
	public void tournerChandelleVersDroite(Coffre coffre) {
		coffre.setEtat(Ouvert.getInstance());
	}
}
