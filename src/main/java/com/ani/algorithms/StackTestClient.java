package com.ani.algorithms;

import java.util.Stack;

public class StackTestClient {
	public static void main ( String [] args) {
		
		Stack stackOfStrings = new Stack();
		String s1 = "One";
		String s2 = "Two";
		String s3 = "Three";
		stackOfStrings.push(s1);
		stackOfStrings.push(s2);
		stackOfStrings.push(s3);
		
		while (! stackOfStrings.empty()) { 
			System.out.println(stackOfStrings.pop());
			
		}
	}

}
