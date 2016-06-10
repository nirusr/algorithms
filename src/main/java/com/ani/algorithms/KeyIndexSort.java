package com.ani.algorithms;

public class KeyIndexSort {
	/*
	    count
		65 66 67 68 69 70
		0  0  0  0  0  0  0 0
		
		arr[]
		0 1 2 3 4 5 6 7
		A B C C A D A
		
		
		arr[0] = A == 65 <==(int('A'))
		count[65] = 0 + 1 = 1
		
		arr[1] = B == 66
		count[66] = 0 + 1 = 1
		
		arr[2] = A == 65
		count[65] = 1
		count[65] = 1 + count[65] = 1+1 = 2

	 */
	
	public void sort(char arr[]){
		int n = arr.length;
		int count[] = new int[256];
		
		for (int i = 0; i < n ; i++ ) {
			System.out.println(" "+ (int) arr[i]);
			//count[arr[i]+1]++;
			++count[arr[i]];
			System.out.println(" "+ count[arr[i]] );
		}
	}
	public static void main(String[] args) {
		char arr[] = {'A', 'B', 'A', 'C', 'A', 'D', 'A',
                
               };
		KeyIndexSort is = new KeyIndexSort();
		is.sort(arr);
	}
}
