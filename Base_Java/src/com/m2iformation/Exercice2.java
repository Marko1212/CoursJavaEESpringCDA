package com.m2iformation;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre un nombre : ");
		double a = sc.nextDouble();
		
		System.out.println("Entre encore un nombre : ");
		double b = sc.nextDouble();
		
	/*	if (a > 0 && b > 0 || a < 0 && b < 0) {
			System.out.println("Le produit est positif");
		} else {
			System.out.println("Le produit est n�gatif ou nul");
		} */
		
		//OU EXCLUSIF (XOR)
		if (a < 0 ^ b < 0) {
			System.out.println("Le produit est n�gatif");
		} else {
			System.out.println("Le produit est positif");
		}

	}

}
