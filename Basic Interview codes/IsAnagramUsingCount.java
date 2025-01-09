package com.test;

public class IsAnagramUsingCount {

	public static void main(String[] args) {
		String word = "Swaraa";
		String anagram = "raSwaa";
		Boolean result = isAnagram(word, anagram);
		
		System.out.println(result);
	}

	public static boolean isAnagram (String word, String anagram) {
		if(word.length() != anagram.length()) {
			return false;
		}
		
		int arr[] = new int[256];
		for(int i = 0; i <= word.length() - 1; i++) {
			System.out.println(arr[word.charAt(i)]++);
			System.out.println(arr[anagram.charAt(i)]--);
		}
		
		for (int i : arr) {
			if(arr[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
