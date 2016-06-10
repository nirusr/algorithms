package com.ani.algorithms;

import java.util.Hashtable;

public class StringPermutation {
	
	public static boolean permuatated( String s1, String s2) {
		
		Hashtable<Integer, Character> s2ht = new Hashtable();
		for ( int j = 0; j < s2.length(); j++) {
			
			s2ht.put( j, Character.toUpperCase(s2.charAt(j)));			
		}
		
		for ( int i = 0; i < s1.length(); i++) {
			if ( ! s2ht.contains(Character.toUpperCase(s1.charAt(i))) ) {
				return false;
			}
		}
		
		return true;		
	}
	public static void main( String[] args) {
		StringPermutation sp = new StringPermutation();
		System.out.println(sp.permuatated("ABc", "CaB"));
	}

}
