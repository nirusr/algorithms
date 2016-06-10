package com.ani.algorithms;

public class Gcd {

	public Gcd() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static int findGCD(int i, int j ) {
		
		if ( i < j) {
			int temp = j;
			j = i;
			i = temp;
		}
		
		if ( j == 0) {
			System.out.println( i);
			return i;
		}
		
		return findGCD(j, i%j);
		
		
	}
	
	public static void main(String[] args) {
		Gcd.findGCD(3, 5);
	}

	

}
