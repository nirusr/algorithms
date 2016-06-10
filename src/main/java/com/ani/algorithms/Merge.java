package com.ani.algorithms;

public class Merge {

	public Merge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		char[] score = { 'E', 'E', 'G', 'M', 'R', 'A', 'C', 'E' , 'R', 'T'};

		char auxScore[] = new char[score.length];

		// copy array to aux array
		for (int i = 0; i < score.length; i++) {
			auxScore[i] = score[i];
			score[i] = ' ';
		}
		
		int ceil = (int) (Math.ceil(score.length)/2.0) ;
		int floor = (int) (Math.floor(score.length)/2.0);
		
		
		int lIndex = 0;
		int hi = score.length;
		int mid = (ceil + floor)/2;
		int midIndex = mid - 1;
		int rIndex = mid;
		System.out.println("mid:" + mid);
		
		int j = mid; 
		
		for ( int i = 0; i < hi; i ++) {
			
			if ( lIndex > midIndex) { 
				if ( rIndex < hi) {
					score[i] = auxScore[rIndex++];
				}
			} else {
				if ( rIndex > hi) {
					if ( lIndex <= midIndex) {
						score[i] = auxScore[lIndex++];
					}
				} else 
				{
					if ( auxScore[rIndex] < auxScore[lIndex] ) {
						score[i] = auxScore[rIndex++];
					} else {
						score[i] = auxScore[lIndex++];
					}
				}
			}
				
			
		
			
			
			
		}
		for ( int k =0; k < score.length; k++ ) {
			System.out.print(score[k] + ",");
		}
		
		
		

	

	}
	
}
