package com.ani.algorithms;

public class MidPoint {

	public MidPoint() {
		// TODO Auto-generated constructor stub
	}
	public static int midPoint(int[] a) {
		
		//int i = (int) Math.ceil(a.length/2.0);
		//int j = (int) Math.floor(a.length/2.0);
		//return ((i+j)/2);
		return a.length/2;
		
	}
	
	public static void divideArray( int[] a, int startIndex, int endIndex) {
		
		int pIndex = startIndex;
		int rIndex = endIndex;
		int midIndex = ((endIndex)/2) - 1 ;
		int[] aOrig = a;
		
		for ( int k = startIndex; k <= midIndex; k++ ) {
			System.out.print(aOrig[k] + " ");
		}
		System.out.println("\n");
		for ( int k = midIndex + 1; k <= rIndex; k++ ) {
			System.out.print(aOrig[k] + " ");
		}
		
		

	
		
		
	}
	
	public static void main(String[] args) {
		int [] a = { 11,10,7,8,9,5,2,1,3,4,6 };
		System.out.println(MidPoint.midPoint(a));
		divideArray(a, 0, a.length-1);
			
			
			
			
		
		
		
	}
}
