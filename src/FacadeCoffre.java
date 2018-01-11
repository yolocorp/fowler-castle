
public class FacadeCoffre implements I_Coffre{
	
	private I_Coffre coffre;
	
	public FacadeCoffre () {
		coffre = new Coffre();
	}

	public void oterLivre () {
		coffre.oterLivre();
	}
	
	public void remettreLivre() {
		coffre.remettreLivre();
	}
	
	public void tournerChandelleVersGauche() {
		coffre.tournerChandelleVersGauche();
	}
	
	public void tournerChandelleVersDroite() {
		coffre.tournerChandelleVersDroite();
	}
	
	public void fermerCoffre() {
		coffre.fermerCoffre();
	}

	@Override
	public boolean lapinEstLibere() {
		return coffre.lapinEstLibere();
	}

	@Override
	public boolean chienEstLibere() {
		return coffre.chienEstLibere();
	}

	@Override
	public String nomEtat() {
		return coffre.nomEtat();
	}
}
