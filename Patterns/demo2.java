package com.test.patterns;

public class demo2 {

	public static void main(String[] args) {
//		int j;
//		for(i=5; i>=1; i--)
//		{
//			for(j=1; j < i; j++) 
//			{
//				System.out.print(" ");
//			}
//			for(j=0; j<=5-i; j++) 
//			{
//				System.out.print("*");
//			}	
//			System.out.println();
//		}
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i ; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k <=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
