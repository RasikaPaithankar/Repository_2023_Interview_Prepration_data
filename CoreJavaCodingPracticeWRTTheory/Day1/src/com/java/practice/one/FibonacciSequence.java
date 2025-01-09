package com.java.practice.one;

public class FibonacciSequence {
	
	public static void fabonacciSeq(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		
		for(int i = 1; i <= n ; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
	}

	public static void main(String[] args) {
		fabonacciSeq(5);
	}

}
