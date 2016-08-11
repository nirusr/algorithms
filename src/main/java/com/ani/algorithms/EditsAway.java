package com.ani.algorithms;

import java.util.Hashtable;
//kind of challenging..will revisit later...
public class EditsAway {

	
	
	String longStr = new String();
	String shortStr = new String();
	

	
	public void assignStr(String s1, String s2) {
		//Note: Strings are immutuable
		if ( s1.length() > s2.length() ) {
			longStr = s1;
			shortStr = s2;
			System.out.println(deleteAway(s1,s2));
		} else if ( s1.length() < s2.length()) {
			longStr = s2;
			shortStr = s1;
		} else if ( s1.length() == s2.length()) { //does not matter
			longStr = s1;
			shortStr = s2;
		}
	}

	
	
	public static boolean deleteAway(String longString, String shorterString) {
		int oddCharCount = 0;
		char[] longStrChars = longString.toCharArray();
		char[] shortStrChars = shorterString.toCharArray();

		Hashtable<Integer, Character> longStrHash = new Hashtable();
		for ( int i = 0; i < longString.length(); i++) {
			longStrHash.put(i, longStrChars[i]);

		}
		int oddoutIndex = 0;
		for ( int k = 0; k < shorterString.length(); k++) {
			if ( ! (longStrHash.contains(shortStrChars[k]) ) ){
				oddoutIndex = k;
				System.out.println("Character to be removed" + shortStrChars[k] + " at position " + k);
				return false;
			}
		}

		
		return true;

	}
	

		
	public static void main(String[] args) {
		EditsAway ew = new EditsAway();
		ew.assignStr("ABCD", "ZBC");
		
	}

}

		








	

