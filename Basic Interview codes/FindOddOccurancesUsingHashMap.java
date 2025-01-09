package com.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindOddOccurancesUsingHashMap {

	public static void main(String[] args) {
		int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};		
		FindOddOccurances(array);
	}

	private static void FindOddOccurances(int[] array) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < array.length; i++) 
		{
			if(!hm.containsKey(array[i])) 
			{
				hm.put(array[i], 1);
			} else 
			{
				hm.put(array[i], hm.get(array[i]) + 1);
			}
		}
		
		for (Entry e : hm.entrySet()) {
			int value = (int) e.getValue();
			if(value % 2 != 0) 
			{
				System.out.println("Occurance of " + e.getKey() + " is odd. ");
			}
		}
	}

}
