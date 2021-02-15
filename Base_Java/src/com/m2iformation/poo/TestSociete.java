package com.m2iformation.poo;

public class TestSociete {

	public static void main(String[] args) {
		
		Societe societe1 = new Societe();
		societe1.setNom("Annuncio Software");
		
		
		Societe societe2 = new Societe();
		societe2.setNom("Netscape");
		
		Adresse adresse = new Adresse("Castro str", 800, "Mountain View");
		
		
		societe1.setLoc(adresse);
		
		societe2.setLoc(adresse);
		
		System.out.println(societe1);
		
		System.out.println(societe2);
		
		adresse.setNomRue("University ave");
		adresse.setNomVille("Palo Alto");
		adresse.setNumeroRue(888);
		
		
		System.out.println(societe1);
		System.out.println(societe2);
		
		//on observe que l'adresse a �t� mise � jour 
		//dans les 2 soci�t�s
	}

}