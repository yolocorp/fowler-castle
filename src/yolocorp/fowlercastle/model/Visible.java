package yolocorp.fowlercastle.model;

public abstract class  Visible extends EtatCoffre {
	
	public void remettreLivre(Coffre coffre) {
		coffre.setChienEstLibere(false);
		coffre.setEtat(CacheParBibliotheque.getInstance());
	}
	
	public void tournerChandelleVersGauche (Coffre coffre) {
		coffre.setLapinEstLibere(true);
		coffre.setEtat(Bloque.getInstance());
		
	}

}
