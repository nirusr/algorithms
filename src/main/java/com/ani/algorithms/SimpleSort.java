package com.ani.algorithms;

public class SimpleSort {
	public SimpleSort() {
		
	}
	public static void main(String [] args) {
		
		int[] score = { 5, 100, 2, 2,2,500, 500, 600, 800, 50, 10, -1};
		
		for (int i = 0; i < score.length; i++) {
			int min = i;
			
			for ( int j = i + 1; j < score.length; j++) {
				
				if ( score[min] > score[j] ) {
					min = j;
				}
				//System.out.println(score[min]);
			}
			//swap
			int rVal = score[i];
			int minValue = score[min];
			score[i] = minValue;
			score[min] = rVal;
			
			System.out.print(score[i] + "," );
			
		}
		
		
		
	}
}
