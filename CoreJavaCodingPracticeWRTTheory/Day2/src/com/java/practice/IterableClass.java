package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableClass {

	public static void main(String[] args) {
		int[] i = {1,2,3,4,5,6};
		List<String> l = new ArrayList<String>();
		for (int j : i) {
			System.out.println("j "+ j);
		} 
		
		l.forEach((elememt) -> {System.out.println(elememt);});
		
		Iterator<String> iterator = l.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
