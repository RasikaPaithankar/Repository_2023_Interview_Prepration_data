package com.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashDemo{

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("a");
		
		System.out.println(set);
		
		
		HashMap<String, String> hmp = new HashMap<String, String>();
		hmp.put("a", "a");
		hmp.put("b", "n");
		hmp.put("a", "a");
		System.out.println(hmp);
		
		Set s = hmp.keySet();
		System.out.println(s);
		Set s1 = hmp.entrySet();
		System.out.println(s1);
		
		
		ArrayList<Integer> str = new ArrayList<Integer>();
		for(int i = 1; i<=10; i++) {
			str.add(i);
		}
		
		List list2 =  str.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
		for (Object object : list2) {
			System.out.println(object);
		}
	}


}
