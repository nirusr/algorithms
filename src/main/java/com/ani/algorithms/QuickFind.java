package com.ani.algorithms;

public class QuickFind {
	
	private int holding_array_size;
	private int[] holding_array;
	
	public QuickFind(int size) {
		holding_array_size = size;
		holding_array = new int[holding_array_size];
		for ( int i = 0; i < holding_array_size; i++ ) {
			holding_array[i] = i;
			
		}
	}
	
	public boolean isConnected(int first, int second) {
		return ( holding_array[first] == holding_array[second]);
	}
	
	public void connect(int first, int second) {
		int firstval = holding_array[first];
		int secondval = holding_array[second];
		
		if (! isConnected(first, second)) {
			
			for ( int k =0; k < holding_array_size; k++ ) {
				if ( holding_array[k] == firstval ) {
					holding_array[k] = secondval;
				}
			}
		}
		
		printResults(firstval, secondval);
	}
	
	public void printResults(int first, int second) {
		
		System.out.println("\nConnect " + first + "," + second);
		for (int j = 0; j < holding_array_size ; j ++ ) {
			System.out.print(holding_array[j] + " ");
		}
	}
	
	public static void  main (String[] args)  {
		QuickFind  qf = new QuickFind(10);
		System.out.println("Size of Array: " + qf.holding_array_size);
		qf.connect(5, 6);
		qf.connect(2, 3);
		qf.connect(3, 4);
		qf.connect(4, 9);
		qf.connect(3, 9);
		
	}
}
