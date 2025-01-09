package com.java.practice.one;

public class FactorialUsingRecursion {
	public static long findFactorial(long n) 
	{
		if(n == 1) 
		{
			return 1;
		} else 
		{
			return n* findFactorial(n-1);
		}
	
	}

	public static void main(String[] args) {
			long fact = findFactorial(5);
			System.out.println("Fact "+ fact);
	}

}
