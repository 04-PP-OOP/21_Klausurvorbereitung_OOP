package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
		// test --> Referenzvariable / RAM-Adresse des Objekts/Instanz (object/instance)
		// Test --> Referenztyp (reference type)
		// Object <--> Instanz
		
		Test test = new Test();
		System.out.println("Referenzvariable: " + test);
		test.showAddress();
	}

}
