package com.m2iformation;

import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre un integer : ");
		int i = sc.nextInt();
		
		System.out.println("Entre encore un integer : ");
		int j = sc.nextInt();
		
		System.out.println("La somme est �gale � : " + (i + j));
		System.out.println("Le produit est �gal � : " + i * j);
		System.out.println("Le quotient est �gal � : " + (float) i / j);
		System.out.println("La soustraction est �gale � : " + (i - j));
		System.out.println("Le reste est �gal � : " + i % j);

	}

}