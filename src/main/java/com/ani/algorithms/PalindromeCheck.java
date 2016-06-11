package com.ani.algorithms;

import java.util.Hashtable;

public class PalindromeCheck {
	
	public static boolean isPalindrome(String s1, String s2) {

		int j = s2.length() - 1;
		for ( int i = 0; i < s1.length(); i++ ) {
			if ( ! (Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(s2.charAt(j))) ) {
				//System.out.println(s1.charAt(i) + " ? " + s2.charAt(j));
				return false;
				
			}
			j--;
			
		}
		
		return true;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( PalindromeCheck.isPalindrome("A bCDE", "EDCB A") );

	}

}
