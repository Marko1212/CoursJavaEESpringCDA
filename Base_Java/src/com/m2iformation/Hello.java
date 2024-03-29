package com.m2iformation;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		//entiers primitifs
		byte octet;
		octet = 120;
		
		short s = 8;
		
		int i = 7;
		int j = 4;
		
		long l = 154;
		
		//flottants primitifs		
		float f = 40.4f; //float
		
		double d = 40.8; //double
		
		
		//il faut mettre simple cote!
		char c = '7'; //char
		
		boolean bool = true | false; //boolean
		
		// 7/4 retourne 1 : un entier
		// 7.0 / 4 retourne 1.75
		
		System.out.println((float)4/7);
		
		System.out.println(i/(float)j);
		
		System.out.println(f/i);
		
		System.err.print("bla\r\n"); //en Windows, on est en CRLF, il faut mettre \r\n
		//pour passer � la ligne (\n ne suffit pas sur Windows, surtout pour �crire dans
		//les fichiers; mieux vaut �crire \r\n partout, sur Windows)
		System.out.print("bla\r\n");
		
		System.err.printf("Coucou%s %s %s\r\n", ",", "comment", "vas");
		System.out.println("toto");
		
		String str = "coucou"; // String = type non primitif en Java
		
		Integer i1 = 3;
		Integer i2 = 3;
		
		if (i1 == i2) { //unboxing implicite effectu� par le compilateur
			System.out.println("is equal");
		}
		
		// on ouvre un buffer
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre un integer : ");
		int i5 = sc.nextInt();
		System.out.println("Entre un double : ");
		double d5 = sc.nextDouble();
		System.out.println("Entre un long : ");
		long l5 = sc.nextLong();
		
		//on vide d'abord le buffer, il faut le faire sinon le String ne sera pas lu (un 'bug' Java tr�s ancien)
		sc.nextLine();
		
		//Si on n'a que des nextLine(), il n'y a pas ce bug, on peut cha�ner les nextLine()
		
		System.out.println("Entre un String : ");
		String str5 = sc.nextLine();
		System.out.println(str5);
		
		System.out.println("l'entier vaut " + i5);
		System.out.println("le double vaut " + d5);
		System.out.println("le long vaut " + l5);
		System.out.println("le String vaut " + str5);
		
		
		

	}

}
