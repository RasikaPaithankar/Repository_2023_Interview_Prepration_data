package com.test;

public class IsStringAnagram {

	public static void main(String[] args) {
		String word = "LiveToCode";
		String anagram = "LiveCodeTo";
		Boolean result = isAnagramUsingStringMethod(word, anagram);
		System.out.println(result);
	}
	
	public static boolean isAnagramUsingStringMethod(String word, String anagram) {
		if(word.length() != anagram.length())
			return false;
		for(int i = 0; i <= word.length() - 1; i++) 
		{
			char c = word.charAt(i);
			int index = anagram.indexOf(c);
			
			if(index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index +1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

}
