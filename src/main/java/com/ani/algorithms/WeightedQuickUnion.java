package com.ani.algorithms;

public class WeightedQuickUnion {
	private int holding_array_size;
	private int[] holding_array;
	private int[] rootSize;
	
	public WeightedQuickUnion(int size) {
		holding_array_size = size;
		holding_array = new int[holding_array_size];
		rootSize = new int[holding_array_size];
		for ( int i = 0; i < holding_array_size; i++ ) {
			holding_array[i] = i;
			rootSize[i]=1;
			
		}
	}
	
	public int root(int i) {
		
		while ( i != holding_array[i]) {
			i = holding_array[i];
		}
		return i;
	}
	
	public boolean find(int p, int q) {
		return root(p) == root(q);
	}
	
	public void unite ( int p , int q) {
		if (!find ( p, q )) {
			
			int pRoot = root(p);
			int qRoot = root(q);
			
			//holding_array[pRoot] = qRoot;
			if ( rootSize[pRoot] >= rootSize[qRoot]) {
				holding_array[qRoot] = pRoot;
				rootSize[pRoot] += rootSize[qRoot];
			} else {
				holding_array[pRoot] = qRoot;
				rootSize[qRoot] += rootSize[pRoot];
			}
			printResults(p, q);
		} 
	}
	
	public void printResults(int first, int second) {
			
		System.out.println("\nConnect " + first + "," + second);
		for (int j = 0; j < holding_array_size ; j ++ ) {
			
			System.out.print(rootSize[j] + " ");
		}
		System.out.println("\n");
		
		for (int j = 0; j < holding_array_size ; j ++ ) {
			System.out.print(holding_array[j] + " ");
			
		}
	}
	
	public static void main (String[] args) {
		WeightedQuickUnion wqu  = new WeightedQuickUnion(10);
		wqu.unite(3,4);
		wqu.unite(4, 9);
		wqu.unite(8,0);
		wqu.unite(2,3);
		wqu.unite(5,6);
		wqu.unite(5,9);
		wqu.unite(7,3);
		wqu.unite(4,8);
		wqu.unite(6,1);
		
	}
}
