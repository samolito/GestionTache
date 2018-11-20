package com.gestiontache.controleur;

import com.gestiontache.metier.Membre;
import com.gestiontache.metier.Tache;
import com.gestiontache.metier.TacheMembre;
import java.util.List;



public interface ServiceIlocal {

	public String ajouter_membre(Membre membre);
	public String modifier_membre(Membre memb);
	public Membre rechercher_membre(int id);
	public String supprimer_membre(int id);
	public List<Membre> listemembre();
	//public List<Membre> listemembrepar(String nom);
	public String assigner_tache(TacheMembre tachm);
	public List<TacheMembre> afficher_tachemembre(int id);
	
	public String ajouter_tache(Tache tache);
	public String modifier_tache(Tache tache);
	public Tache rechercher_tache(int id);
	public String supprimer_tache(int id);
	public List<Tache> listetache();
}
