package com.m2iformation.poo.ecole;

import java.util.ArrayList;

public class Cours {
	
	private String nomCours;
	private int nombreHeuresCours;
	private int anneeCours;
	private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
	
	
	

	public Cours(String nomCours, int nombreHeuresCours, int anneeCours) {
		super();
		this.nomCours = nomCours;
		this.nombreHeuresCours = nombreHeuresCours;
		this.anneeCours = anneeCours;
	}



	

	public String getNomCours() {
		return nomCours;
	}





	public void setNomCours(String nomCours) {
		this.nomCours = nomCours;
	}





	public int getNombreHeuresCours() {
		return nombreHeuresCours;
	}





	public void setNombreHeuresCours(int nombreHeuresCours) {
		this.nombreHeuresCours = nombreHeuresCours;
	}





	public int getAnneeCours() {
		return anneeCours;
	}





	public void setAnneeCours(int anneeCours) {
		this.anneeCours = anneeCours;
	}





	public ArrayList<Eleve> getListeEleves() {
		return listeEleves;
	}





	public void setListeEleves(ArrayList<Eleve> listeEleves) {
		this.listeEleves = listeEleves;
	}





	public boolean inscrire(Eleve eleve) {
		
		if (eleve.getAnneeCoursSuivieEleve() == this.getAnneeCours()) {
			this.listeEleves.add(eleve);
			return true;
		}
		 return false;
	}





	@Override
	public String toString() {
		return "Cours [nomCours=" + nomCours + ", nombreHeuresCours=" + nombreHeuresCours + ", anneeCours=" + anneeCours
				+ ", listeEleves=" + listeEleves + "]";
	}


	
	
	
	

}
