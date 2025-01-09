package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {

	
	public void m1(int i) {
		System.out.println("int");
	}
	
	public void m1(Integer i) {
		System.out.println("Integer ");
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(10);
		list2.add(9);
		list2.add(8);
		list2.add(7);
		
		int max = list2.get(0);
		int secondMax = list2.get(0);
		for(int i = 1 ; i< list2.size(); i++) {
			if(list2.get(i) > max) {
				secondMax = max;
				max = list2.get(i);
			}
			if(list2.get(i) > secondMax && list2.get(i) != max) {
				secondMax = list2.get(i);
			}
		}
		
		System.out.println(secondMax);
		
	
		
		Set<Integer> s = new HashSet<>(list2);
		
		System.out.println(s);
		
		HashSet<String> hs = new HashSet<>();
		
		Test t = new Test();
		
		Integer i = 10;
		
		t.m1(i);
		
		
	}

}
