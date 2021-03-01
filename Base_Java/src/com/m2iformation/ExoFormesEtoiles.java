package com.m2iformation;

import java.util.Scanner;

public class ExoFormesEtoiles {

	public static void main(String[] args) 
	{
		int largeur, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre entier positif : ");
		largeur = sc.nextInt();
		System.out.println();
		
		System.out.println("Droite : \n");
		
		for(j = 1; j <= largeur; j++)
		{
			System.out.print("* "); 
		}
		System.out.print("\n\n"); 
	
		System.out.println("Carr� : \n");
			
		for(i = 1; i <= largeur; i++)
		{
			for(j = 1; j <= largeur; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	
		
		System.out.println();
		
		System.out.println("Triangle : \n");
		
		for(i = 1; i <= largeur; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}
		
		
		sc.close();
	}
}