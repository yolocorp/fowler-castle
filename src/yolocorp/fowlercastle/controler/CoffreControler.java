package yolocorp.fowlercastle.controler;

import yolocorp.fowlercastle.model.*;

public class CoffreControler implements I_CoffreControler {
	
	private FacadeCoffre coffre = new FacadeCoffre();

	@Override
	public void oterLivre() {
		coffre.oterLivre();
	}

	@Override
	public void remettreLivre() {
		coffre.remettreLivre();
	}

	@Override
	public void tournerChandelleVersGauche() {
		coffre.tournerChandelleVersGauche();
	}

	@Override
	public void tournerChandelleVersDroite() {
		coffre.tournerChandelleVersDroite();
	}

	@Override
	public void fermerCoffre() {		
		coffre.fermerCoffre();
	}

}
