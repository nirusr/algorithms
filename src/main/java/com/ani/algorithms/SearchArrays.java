package com.ani.algorithms;

import java.util.Arrays;

public class SearchArrays {

	public static void main(String[] args) {
		int scores[] = new int[] { 10, 30, 40, 50, 20, 100, 80, 190, 21 };
		boolean found = false;
		Arrays.sort(scores);

		for (int x : scores) {
			System.out.print(x + ",");
		}
		System.out.println("\n");
		// System.out.println("\n" + Math.ceil(scores.length/2.0) );
		// System.out.println(Math.floor(scores.length/2.0) );

		int leftPos = 1;
		int rightPos = scores.length;
		int middlePos = (int) Math.ceil((rightPos + leftPos) / 2.0);
		System.out.println(rightPos + " " + leftPos + " " + middlePos);

		//int search_score = 191;
		 int search_score = 200;
		while (!found) {
			if (search_score < scores[middlePos - 1]) {
				
				rightPos = middlePos - 1;
				middlePos = (int) Math.ceil((rightPos + leftPos) / 2.0);
				
				//boundary 
				if ( rightPos <= 1) {
					found = true;
					System.out.println("Search " + search_score
							+ "not found between " + rightPos + " " + leftPos);
				}
				//boundary
				if (search_score > scores[rightPos - 1]
						&& search_score < scores[leftPos - 1]) {
					found = true;
					System.out.println("Search " + search_score
							+ "not found between " + rightPos + " " + leftPos);
				}

			} else if (search_score > scores[middlePos - 1]) {
				//boundary
				if (middlePos >= scores.length) {
					found = true;
					System.out.println("Search " + search_score
							+ "not found between " + rightPos + " " + leftPos);
				} else {
					leftPos = middlePos + 1;
					middlePos = (int) Math.ceil((rightPos + leftPos) / 2.0);

				}

			} else {

				found = true;
				System.out.println("Search " + search_score + "found at "
						+ (middlePos - 1));
			}

		}

	}

}
