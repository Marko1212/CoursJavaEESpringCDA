package com.m2iformation.poo.ecole;

import java.util.ArrayList;

public class Ecole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Eleve> listeEleves = new ArrayList<>();
		 
		 ArrayList<Cours> listeCours = new ArrayList<>();
		 
		 Eleve eleve1 = new Eleve("Dupont", "Martin", 13, 1);
		 
		 Eleve eleve2 = new Eleve("Leconte", "Henri", 14, 2);
		 
		 Eleve eleve3 = new Eleve("Laurent", "Pierre", 15, 3);
		 
		 Eleve eleve4 = new Eleve("Askovic", "Marko", 15, 3);
		 
	  
		 listeEleves.add(eleve1);
		 listeEleves.add(eleve2);
		 listeEleves.add(eleve3);
		 listeEleves.add(eleve4);
		 
		 Cours maths = new Cours("Maths", 150, 2);
		 Cours physique = new Cours("Physique", 130, 1);
		 
		 Cours chimie = new Cours("Chimie", 140, 3);
		 
		 listeCours.add(maths);
		 listeCours.add(physique);
		 listeCours.add(chimie);
		 
		 maths.inscrire(eleve1);
		 maths.inscrire(eleve2);
		 maths.inscrire(eleve3);
		 maths.inscrire(eleve4);
		 
		 physique.inscrire(eleve1);
		 physique.inscrire(eleve2);
		 physique.inscrire(eleve3);
		 physique.inscrire(eleve4);
		 
		 chimie.inscrire(eleve1);
		 chimie.inscrire(eleve2);
		 chimie.inscrire(eleve3);
		 chimie.inscrire(eleve4);
		 
		 
		 
		 System.out.println("Inscrits au cours de Maths : " + maths );
		 System.out.println("Inscrits au cours de Physique : " + physique );
		 System.out.println("Inscrits au cours de Chimie : " + chimie );
		 

	}

}
