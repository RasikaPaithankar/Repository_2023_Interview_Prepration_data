package com.test;

public class StringSizeWithoutInbuiltFunction {

	public static void main(String[] args) {
		String sr = "Swar";
		
		approach1(sr);
		
		int result = approach2(sr);
		System.out.println(result);
				
	}

	private static int approach2(String sr) {
		int i = 0;
		try 
		{
			for(i= 0; ; i++) 
			{
				sr.charAt(i);
			}
		} catch (Exception e) 
		{
			
		}
		return i;
	}

	private static void approach1(String sr) 
	{
		int count = 0;
		char arr[] = sr.toCharArray();
		for (char c : arr) 
		{
			System.out.print(c);
			count++;
		}
			System.out.println(" " +count);
	} 		
}
