package com.test;

public class FindStringSubString {

	public static void main(String[] args) 
	{
		String sr = "Swar";
		findSubString(sr);
	}

	private static void findSubString(String sr) 
	{
		for(int i = 0; i < sr.length() ; i++) 
		{
			for(int j = i+1; j <= sr.length(); j++) {
				System.out.print(sr.substring(i, j) + " ");
			}
		}
	}

}
