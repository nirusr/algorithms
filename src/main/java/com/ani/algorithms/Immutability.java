package com.ani.algorithms;

public class Immutability {
	
	
	String s1 = "ABC";
	String s2 = s1;
	public static void main( String [] args) {
		String s1 = "ABC";
		String s2 = s1;
		
		s1 = s1 + "B";
		System.out.println(s1 + " " + s2 );
		//s2 still points to object s1 initially created.
	}
	
	
	

}
