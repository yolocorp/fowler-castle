package yolocorp.fowlercastle.model;

import yolocorp.fowlercastle.observateur.Observateur;

public interface I_Coffre {

	public abstract void oterLivre();

	public abstract void remettreLivre();

	public abstract void tournerChandelleVersDroite();

	public abstract void tournerChandelleVersGauche();

	public abstract void fermerCoffre();

	public abstract boolean lapinEstLibere();

	public abstract boolean chienEstLibere();
	
	public abstract String nomEtat();
	
	public abstract boolean peutOterLivreUML();
	
	public abstract boolean peutRemettreLivreUml();

	public abstract boolean peutTournerChandelleVersGauche();

	public abstract boolean peutTournerChandelleVersDroite();
	
	public abstract boolean peutFermerCoffre();

	public void addObservateur(Observateur o);
	
	public void removeObservateur(Observateur o);
	
	public void notifyObservateur();
	
}
