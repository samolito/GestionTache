package com.gestiontache.metier;

public class Membre {

	int membreID;
	String membreNom;
	String membrePrenom;
	String membreAdresse;
	String membreTel;
	String membreEmail;
	public Membre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Membre(int membreID, String membreNom, String membrePrenom, String membreAdresse, String membreTel,
			String membreEmail) {
		super();
		this.membreID = membreID;
		this.membreNom = membreNom;
		this.membrePrenom = membrePrenom;
		this.membreAdresse = membreAdresse;
		this.membreTel = membreTel;
		this.membreEmail = membreEmail;
	}
	
	public Membre(int membreID) {
		super();
		this.membreID = membreID;
	}
	public int getMembreID() {
		return membreID;
	}
	public void setMembreID(int membreID) {
		this.membreID = membreID;
	}
	public String getMembreNom() {
		return membreNom;
	}
	public void setMembreNom(String membreNom) {
		this.membreNom = membreNom;
	}
	public String getMembrePrenom() {
		return membrePrenom;
	}
	public void setMembrePrenom(String membrePrenom) {
		this.membrePrenom = membrePrenom;
	}
	public String getMembreAdresse() {
		return membreAdresse;
	}
	public void setMembreAdresse(String membreAdresse) {
		this.membreAdresse = membreAdresse;
	}
	public String getMembreTel() {
		return membreTel;
	}
	public void setMembreTel(String membreTel) {
		this.membreTel = membreTel;
	}
	public String getMembreEmail() {
		return membreEmail;
	}
	public void setMembreEmail(String membreEmail) {
		this.membreEmail = membreEmail;
	}
	
}
