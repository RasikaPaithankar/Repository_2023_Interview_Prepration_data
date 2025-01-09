package com.test;

import java.util.Arrays;

public class IsStringAnagramUsingSortMethod {

	public static void main(String[] args) {
		String word = "LiveToCode";
		String anagram = "LiveCode To";
		Boolean result = isStringAnagramUsingSortMethod(word, anagram);
		System.out.println(result);
	}

	public static boolean isStringAnagramUsingSortMethod(String word, String anagram) 
	{
		String sortedWord = sortChars(word);
		String sortedanagram = sortChars(anagram);
		if(sortedWord.equals(sortedanagram)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String sortChars(String s) {
		String sortedString = "";
		char sortChar[] = s.toCharArray();
		Arrays.sort(sortChar);
		return String.valueOf(sortChar);
	}
}
