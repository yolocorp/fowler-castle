package yolocorp.fowlercastle.model;
import java.util.ArrayList;
import java.util.List;

import yolocorp.fowlercastle.observateur.Observateur;

public class Coffre implements I_Coffre {

	private EtatCoffre etat;
	private boolean chienEstLibere;
	private boolean lapinEstLibere;
	private List<Observateur> auditeurs;
	
	public Coffre () {
		this.auditeurs = new ArrayList<Observateur>();
		this.etat = CacheParBibliotheque.getInstance();
		setChienEstLibere(false);
		setLapinEstLibere(false);
	}
	
	@Override
	public void oterLivre() {
		etat.oterLivre(this);
	}

	@Override
	public void remettreLivre() {
		etat.remettreLivre(this);
	}

	@Override
	public void tournerChandelleVersDroite() {
		etat.tournerChandelleVersDroite(this);
	}

	@Override
	public void tournerChandelleVersGauche() {
		etat.tournerChandelleVersGauche(this);
	}

	@Override
	public void fermerCoffre() {
		etat.fermerCoffre(this);
	}

	@Override
	public boolean lapinEstLibere() {
		return this.lapinEstLibere;
	}

	@Override
	public boolean chienEstLibere() {
		return this.chienEstLibere;
	}

	@Override
	public String nomEtat() {
		return etat.nomEtat();
	}
	
	public void setEtat (EtatCoffre etat) {
		this.etat = etat;
	}
	
	public void setChienEstLibere (boolean chienEstLibere) {
		this.chienEstLibere = chienEstLibere;
	}

	public void setLapinEstLibere (boolean lapinEstLibere) {
		this.lapinEstLibere = lapinEstLibere;
	}
	
	public void addObservateur(Observateur o) {
		auditeurs.add(o);
	}
	
	public void removeObservateur(Observateur o) {
		auditeurs.remove(o);
	}
	
	public void notifyObservateur() {
		for(Observateur o : auditeurs) {
			o.update(this);
		}
	}
}
