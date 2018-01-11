
public abstract class  Visible extends EtatCoffre {
	
	public void remettreLivre(Coffre coffre) {
		coffre.setEtat(new CacheParBibliotheque());
		coffre.setChienEstLibere(false);
	}
	
	public void tournerChandelleVersGauche (Coffre coffre) {
		coffre.setEtat(new Bloque());
		coffre.setLapinEstLibere(true);
	}

}
