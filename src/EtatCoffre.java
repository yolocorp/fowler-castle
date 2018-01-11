
public abstract class EtatCoffre {
	
	public void oterLivre (Coffre coffre) {}
	
	public void remettreLivre (Coffre coffre) {}
	
	public void tournerChandelleVersDroite (Coffre coffre) {}
	
	public void tournerChandelleVersGauche (Coffre coffre) {}
	
	public void fermerCoffre (Coffre coffre) {}
	
	public void lapinEstLibere (Coffre coffre) {}
	
	public void chienEstLibere (Coffre coffre) {}
	
	public String nomEtat () {
		return this.getClass().getName();
	}
}
