package com.java.practice;

import java.util.IdentityHashMap;
import java.util.Map.Entry;

public class MyIdentityHashedMap {

	public static void main(String[] args) {
		IdentityHashMap<String, Integer> im = new IdentityHashMap<String, Integer>();
		String s1 = new String("10");
		String s2 = new String("10");
		im.put(s1, 10);
		im.put(s2, 20);
		for(Entry<String, Integer> i : im.entrySet()) {
			System.out.println(i);
		}
	}

}
