
public abstract class  Visible extends EtatCoffre {
	
	public void remettreLivre(Coffre coffre) {
		coffre.setEtat(new Cache());
	}
	
	public void tournerChandelleVersGauche (Coffre coffre) {
		coffre.setEtat(new Bloque());
	}

}
