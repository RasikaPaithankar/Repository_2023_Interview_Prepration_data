package com.test;

public class IsStringHasAllUniqueCharchtersUsingStringMethods {

	public static void main(String[] args) 
	{
		String sr = "Swar";
		boolean result = isAllUnique(sr);
		System.out.println(result);
	}

	private static boolean isAllUnique(String sr) 
	{
		for(int i = 0; i <= sr.length()-1 ; i++) 
		{
			int fi = sr.indexOf(sr.charAt(i));
			int li = sr.lastIndexOf(sr.charAt(i));

			if(fi != li) {
				System.out.println(sr.charAt(i) + " " + "is repetative.");
				return false;
			}
		}
		return true;
	}

}
