package com.java.practice.one;

import java.util.ArrayList;
import java.util.List;

public class CheckOddNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);list.add(4);list.add(6);list.add(8);list.add(12);
		list.add(22);list.add(24);list.add(21);
		for (Integer num : list) {
			if(num%2 != 0) {
				System.out.println("Number " + num +" is a odd number." );
			}
		}
		
		// using Stream
		
		boolean flag = false;
		flag = list.parallelStream().anyMatch(x -> x%2 != 0);
		if(flag == true) {
			System.out.println("List contains odd number");
		}
	}

}
