package com.test;

import java.util.HashSet;

public class StringAnagram {

	public static void main(String[] args) 
	{
		String sr = "Angle";
		String sr2 = "Angee";
		
		char ch;
		if(sr.length() != sr2.length()) 
		{
			System.out.println("String is not anagram");
		} else 
		{
			HashSet<Character> ht = new HashSet<Character>();
			for(int i = 0; i <= sr.length()-1; i++) {
				ch = sr.charAt(i);
				ht.add(ch);
			}
			
			HashSet<Character> ht2 = new HashSet<Character>();
			for(int i = 0; i <= sr2.length()-1; i++) {
				ch = sr2.charAt(i);
				ht2.add(ch);
			}
			
			if(ht.equals(ht2)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}
}
