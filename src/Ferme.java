
public class Ferme extends Visible {

	public void tournerChandelleVersDroite(Coffre coffre) {
		coffre.setEtat(new PresqueOuvert());
		coffre.setChienEstLibere(true);
	}
}
