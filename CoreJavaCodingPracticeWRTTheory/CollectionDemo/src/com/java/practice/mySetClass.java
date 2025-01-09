package com.java.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class mySetClass {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(6);
		
		for (Integer integer : set) {
			System.out.print(integer);
		}
		
		System.out.println();
		set.add(2);
		set.add(3);
		
		for (Integer integer : set) {
			System.out.print(integer);
		}
		
		
		Set<String> str = new HashSet<>();
//		str.addAll(set);	
		
		
		List<String> list = new ArrayList<>();
//		List<Integer> i = new ArrayList<>(list);
		
		HashSet<Integer> hashset = new HashSet<>();		

		SortedSet<String> sortedSet = new TreeSet<>();
		
		System.out.println();
		
		Map<Integer, Integer> mp = new HashMap<>();
		mp.put(1, 1276);
		mp.put(2, 783);
		mp.put(5, 999);
		
		Set<Entry<Integer, Integer>> entries = mp.entrySet();
		
		for (Entry<Integer, Integer> entry : entries) {
			entry.getKey();
			entry.getValue();
		}
		
		Iterator<Entry<Integer, Integer>> itr = entries.iterator();
		while(itr.hasNext()) {
			Entry<Integer, Integer> e = itr.next();
			e.getKey();
			e.getValue();
		}
				
		for (Map.Entry<Integer , Integer> entry : mp.entrySet()) {
			System.out.println();
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
		
		
		for(Integer i : mp.keySet()) {
			System.out.println(i);
		}
		
		
		
		System.out.println("******************");
		mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("******************");
		mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		System.out.println("******************");
		mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("******************");
		mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}
	
	

}
