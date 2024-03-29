package com.m2iformation;

import java.util.ArrayList;
import java.util.Iterator;

public class TableauxCollections {

    public static void main(String[] args) {
    	
    	
    	if (args.length != 0) {
    	
    	for (int i = 0; i < args.length; i++) {
    		System.out.println((i+1) + ":" + args[i]);
    	}
    	
    	}

        String[] listeDeNoms = new String[10];
        listeDeNoms[0] = "Hello";
        listeDeNoms[9] = "Hello";
        System.out.println(listeDeNoms[1]);

        for (int i = 0; i < listeDeNoms.length; i++) {
            System.out.println(listeDeNoms[i]);
        }

        for (String str : listeDeNoms){
            System.out.println(str);
        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");

        System.out.println(list2.get(0));

        System.out.println("fori");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("for each");
        for (String str : list2){
            System.out.println(str);
        }

        System.out.println("iterator");
        Iterator<String> it = list2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("foreach");
        list2.forEach((str) ->  System.out.println(str));

        System.out.println("foreach println");
        list2.forEach(System.out::println);



    }

}