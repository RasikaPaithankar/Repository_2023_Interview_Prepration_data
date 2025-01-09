package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;

public class A {
	
	public static void main() {
		ArrayList<String> names = new ArrayList<String>();
	    names.add("Raj");
	    names.add("Priya");
	    names.add("Shashank");
	    names.add("Ansh");
	    System.out.println("Before sorting, names : " + names);
	    
	    Collections.sort(names);
	    System.out.println("Before sorting, names : " + names);
	}
}
