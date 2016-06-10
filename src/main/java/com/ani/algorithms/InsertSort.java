package com.ani.algorithms;

public class InsertSort {

	public InsertSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int score[] = { 10, 2, 1,5, 3, 20, 21,12 };

		for (int i = 0; i < score.length; i++) {
			int ival = score[i];
			for (int j = i; j >= 1; j--) {
				//System.out.println(score[j] + " < " + score[j - 1]);
				if (score[j] < score[j - 1]) {
					// System.out.println( score[j] + " < " + score[j-1]);
					int min = score[j];
					int max = score[j - 1];
					score[j] = max;
					score[j - 1] = min;
					for (int k =0; k < score.length; k++ ) { System.out.print(score[k] +",");}
				}

			}
			
			System.out.print("\n");

		}
		for (int k =0; k < score.length; k++ ) { System.out.print(score[k] +",");}
		
		
	}
}
