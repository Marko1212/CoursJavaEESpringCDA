package com.m2iformation;

import java.util.Scanner;

public class ExoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veux-tu ouvrir (1), quitter (2), ou sauver (3) ?");

		int i = sc.nextInt();
		
		switch (i) {
		  case 1:
		    System.out.println("On ouvre!");
		    break;
		  case 2:
		    System.out.println("On quitte!");
		    break;
		  case 3:
			    System.out.println("On sauve!");
			break;
		  default:
		    System.out.println("D�sol�, ce choix n'existe pas. Bye bye!");
		}

		//on ferme le buffer � la fin
		sc.close();
	}

}
