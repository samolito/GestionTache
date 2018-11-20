package com.gestiontache.metier;

public class Tache {

	int tacheId;
	String tacheNom;
	String tacheDescription;
	String  tacheDate_debut;
	String tacheDate_fin;
	String tacheEtat;
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tache(int tacheId, String tacheNom, String tacheDescription, String tacheDate_debut, String tacheDate_fin,
			String tacheEtat) {
		super();
		this.tacheId = tacheId;
		this.tacheNom = tacheNom;
		this.tacheDescription = tacheDescription;
		this.tacheDate_debut = tacheDate_debut;
		this.tacheDate_fin = tacheDate_fin;
		this.tacheEtat = tacheEtat;
	}
	
	public Tache(int tacheId) {
		super();
		this.tacheId = tacheId;
	}
	public int getTacheId() {
		return tacheId;
	}
	public void setTacheId(int tacheId) {
		this.tacheId = tacheId;
	}
	public String getTacheNom() {
		return tacheNom;
	}
	public void setTacheNom(String tacheNom) {
		this.tacheNom = tacheNom;
	}
	public String getTacheDescription() {
		return tacheDescription;
	}
	public void setTacheDescription(String tacheDescription) {
		this.tacheDescription = tacheDescription;
	}
	public String getTacheDate_debut() {
		return tacheDate_debut;
	}
	public void setTacheDate_debut(String tacheDate_debut) {
		this.tacheDate_debut = tacheDate_debut;
	}
	public String getTacheDate_fin() {
		return tacheDate_fin;
	}
	public void setTacheDate_fin(String tacheDate_fin) {
		this.tacheDate_fin = tacheDate_fin;
	}
	public String getTacheEtat() {
		return tacheEtat;
	}
	public void setTacheEtat(String tacheEtat) {
		this.tacheEtat = tacheEtat;
	}
	
	
}
