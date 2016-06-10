package com.ani.algorithms;

public class URLify {
	
	public static String URLify(String s1) {
		
		StringBuilder newStr = new StringBuilder();
		
		for ( int i = 0; i < s1.length(); i++) {
			if ( s1.charAt(i) == ' ') {
				newStr.append("%20");
				i = i + 2;
			} else {
				newStr.append(s1.charAt(i));
			}
		}
		System.out.println(newStr.toString());
		return newStr.toString();

	}

	
	public static void main( String[] args) {
		
		URLify.URLify("This      Website   for   ");
		
	}
}
