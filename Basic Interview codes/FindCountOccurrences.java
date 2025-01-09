package com.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindCountOccurrences {

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 3, 3, 4, 5, 5, 6, 6};
		// this approach only for sorting array
// 		findCountOfNumberOccurrences(arr); 
		
		
//	approach 2 Hashmap
		findFrequencyOfNumbersUsingHashMap(arr);
		
	}

	private static void findFrequencyOfNumbersUsingHashMap(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i =0; i < arr.length; i++) 
		{
			if(!hm.containsKey(arr[i]))
			{
				hm.put(arr[i], 1);
			} else 
			{
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}
		}
		
		for (Entry<Integer, Integer> i : hm.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
	}

	private static void findCountOfNumberOccurrences(int[] arr) {
		int count = 0;
		int i = 0;
		for(int j=0; j < arr.length; j++) 
		{
			if(arr[i] == arr[j])
			{
				count++;
				System.out.println(" Count of  " + arr[i] + " is " + count);
			} else
			{
				i = j;
				j--;
				count = 0;
			}	
		}

	}

}
