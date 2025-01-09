package com.java.practice.one;

public class ContainsVowels {
	
	
	
	public static void isContainVowel(String s) 
	{
		boolean r = false;
		Character[] ch = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
		for(int i=0; i<= ch.length-1; i++) {
			r = s.contains(ch[i].toString());
			System.out.println("r " +r );
			if(r == true) 
			{
				System.out.println("Contains vowel");
				break;
			} else 
			{
				System.out.println("Not Contains vowel");	
			}
		}
	}
	
	public static void isContainsVowelUsingMatchesMethod(String s){
		boolean b = false;
		b = s.matches(".*[aieou].*");
		if(b == true)
		{
			System.out.println("String Contains vowel");
		} else {
			System.out.println("String does not Contains vowel");
		}
	}

	public static void main(String[] args) {
		
		// isContainVowel("HEllO");
		isContainsVowelUsingMatchesMethod("Helllo");
		isContainsVowelUsingMatchesMethod("Sky");
	}

}
