package com.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicatesFromString {

	public static void main(String[] args) {
		String sr = "Repetative";
//	approach 1st
		findDuplicate(sr);
//	approach 2nd
		findDuplicates(sr);
	}

	private static void findDuplicates(String sr) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for(int i = 0; i < sr.length() ; i++) 
		{			
			char c = sr.charAt(i);
			if(hm.containsKey(c)) 
			{
				hm.put(c, hm.get(c) + 1);
			} else 
			{
				hm.put(c, 1);
			}	
		}
		
		for (Character h: hm.keySet()) 
		{
			if(hm.get(h) > 1) 
			{
				System.out.println("duplicate character is "+ h +" and count is "+ hm.get(h));
			}
		}
		
		for(Character k: hm.keySet()) 
		{
			if(hm.get(k) == 1)
			{
				System.out.println("non-duplicate charcter is "+ k );
			}
		}
		
		for(Entry<Character, Integer> en : hm.entrySet())
		{
			System.out.println(en.getKey() + " " + en.getValue());
		}		

	}

	private static void findDuplicate(String sr) 
	{
		for(int i = 0; i <= sr.length()-1; i++) 
		{
			char c = sr.charAt(i);
			
			if(sr.indexOf(c) != sr.lastIndexOf(c)) {
				System.out.println(c + " is repetative word.");
			}
		}
	}

}
