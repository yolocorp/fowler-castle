package yolocorp.fowlercastle.model;

public abstract class  Visible extends EtatCoffre {
	
	public void remettreLivre(Coffre coffre) {
		coffre.setEtat(CacheParBibliotheque.getInstance());
		coffre.setChienEstLibere(false);
	}
	
	public void tournerChandelleVersGauche (Coffre coffre) {
		coffre.setEtat(Bloque.getInstance());
		coffre.setLapinEstLibere(true);
	}

}
