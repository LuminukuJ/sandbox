package com.socgen.javabasics;

public class Primitives {
    /**
     * 
     */
    public static void main(String[] args) {
	Calculator calc = new Calculator(5, 5);

	double multiplication = calc.multiply();
	double addition = calc.add();
	System.out.println(multiplication + addition);

//	System.out.println(calc.add());
//	System.out.println(calc.divide());
//	System.out.println(calc.multiply());
//	System.out.println(calc.substract());

	// Types primitifs
	double doubleType;
	int intType;
	short shortType;
	byte byteType;
	float floatType;
	char charType;
	long longType;
	boolean booleanType;
    }

}
