package com.gestiontache.metier;

public class TacheMembre {

	public int idtachemembre;
	public int  idmembre;
	public int idtache;
	public TacheMembre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TacheMembre(int idtachemembre,int idmembre, int idtache) {
		super();
		this.idtachemembre = idtachemembre;
		this.idmembre = idmembre;
		this.idtache = idtache;
	}
	public int getIdtachemembre() {
		return idtachemembre;
	}
	public void setIdtachemembre(int idtachemembre) {
		this.idtachemembre = idtachemembre;
	}
	public int getIdmembre() {
		return idmembre;
	}
	public void setIdmembre(int idmembre) {
		this.idmembre = idmembre;
	}
	public int getIdtache() {
		return idtache;
	}
	public void setIdtache(int idtache) {
		this.idtache = idtache;
	}
	
	
}

