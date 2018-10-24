package com.socgen.javabasics;

public class Tableau {

    public static void main(String[] args) {

	int[] tabint = new int[10];
	for (int i = 0; i < tabint.length; i++) {
	    tabint[i] = i + 1;
	    System.out.println("index=" + i + " valeur=" + tabint[i]);
	}

    }

}
