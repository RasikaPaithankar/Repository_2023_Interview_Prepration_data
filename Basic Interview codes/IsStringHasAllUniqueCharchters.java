package com.test;

import java.util.HashSet;

public class IsStringHasAllUniqueCharchters {

	public static void main(String[] args) {
		String sr = "Swara";
		boolean result = isAllUnique(sr);
		System.out.println(result);
	}

	private static boolean isAllUnique(String sr) {
		HashSet<Character> ht = new HashSet<Character>();
		
		for(int i =0; i <= sr.length()-1; i++) {
			if(!ht.contains(sr.charAt(i))) {
				ht.add(sr.charAt(i));
			} else {
				return false;
			}
		}
		return true;
	}

}
