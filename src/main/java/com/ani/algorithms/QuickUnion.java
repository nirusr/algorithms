package com.ani.algorithms;

public class QuickUnion {
	
	private int holding_array_size;
	private int[] holding_array;
	
	public QuickUnion(int size) {
		holding_array_size = size;
		holding_array = new int[holding_array_size];
		for ( int i = 0; i < holding_array_size; i++ ) {
			holding_array[i] = i;
			
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
			holding_array[pRoot] = qRoot;
			printResults(p, q);
		} 
	}
	
	public void printResults(int first, int second) {
			
		System.out.println("\nConnect " + first + "," + second);
		for (int j = 0; j < holding_array_size ; j ++ ) {
			System.out.print(holding_array[j] + " ");
		}
	}
	
	public static void main (String[] args) {
		QuickUnion qu  = new QuickUnion(10);
		qu.unite(3,4);
		qu.unite(4, 9);
		qu.unite(8, 0);
		qu.unite(2, 3);
		qu.unite(5, 6);
		qu.unite(5, 9);
		qu.unite(7, 3);
		qu.unite(4, 8);
		qu.unite(6, 1);
		qu.unite(5, 9);
	}
}
