package com.java.practice.one;

public class FindFactorial {
	
	public static void factorial(int n) {
		int fact=1;
		for(int i = n; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		factorial(4);
	}

}
