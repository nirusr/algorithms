package com.ani.algorithms;

public class CumlativeSum {
	public static void main (String[] args) {
		int x = 0;
		int N = 4;
		for ( int i = 0 ; i < N; i ++ ) {
			for ( int j = i + 1; j < N; j++ ) {
				for ( int k = j + 1; k < N; k ++ ) {
					x++;
				}
			}
		}
		System.out.println(x);
		
		
		
	}
}
