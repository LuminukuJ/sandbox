package com.socgen.javabasics;

public class Arrays {

    public static void main(String[] arg) {
	int[] ints = new int[10];
	ints[3] = 5;
	System.out.println(ints[3]);

	// boolean par defaut = false
	boolean[] bool = new boolean[10];
	bool[5] = true;
	System.out.println(bool[5]);

	for (int i = 0; i < bool.length; i++) {
	    System.out.println("index=" + i + ", value=" + bool[i]);
	}

	for (int i = 9; i > bool.length; i--) {
	    System.out.println("index=" + i + ", value=" + bool[i]);
	}
    }
}
