package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;


class B {
	
	public B() {
		
	}
	
	public static void m1() {
		System.out.println("Static method");
	}

	public void m2() {
		System.out.println("Non static method.");
	}
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
	    names.add("Raj");
	    names.add("Priya");
	    names.add("Shashank");
	    names.add("Ansh");
	    System.out.println("Before sorting, names : " + names);
	    
	    Collections.sort(names);
	    System.out.println("Before sorting, names : " + names);
	    
	    names.set(0, "Rahil");
	    System.out.println("After set element at 0 "+ names);
	    
	    
	    ArrayList<String> colors = new ArrayList<String>();
	    colors.add("red");
	    colors.add("orange");
	    colors.size();
	    colors.clear();
	    System.out.println("ArrayList is empty "+ colors.isEmpty());
	    
	    colors.add("blue");
	    colors.add("pink");
	    colors.add("black");
	    colors.add("green");

	    System.out.println("ArrayList colors : " + colors);
	    
	    // removing element pink from the ArrayList
	    colors.remove("pink");
	    System.out.println("ArrayList colors : " + colors);
	    
	    // removing 3rd element from the ArrayList
	    colors.remove(2);
	    System.out.println("ArrayList colors : " + colors);
	    
	    ListIterator<String> iterator = colors.listIterator();
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }	    
	    
	    
	    List<String> animal = new ArrayList<String>();
	    animal = Collections.synchronizedList(animal);
	    
	    synchronized (animal) {
			ListIterator<String> listIterator = animal.listIterator();
			while(listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}
		}
		
	    synchronized (animal) {
			Iterator iterator2 = animal.iterator();
			while(iterator2.hasNext()) {
				System.out.println(iterator2.next());
			}
		}
    
	    CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<>();
	    arr.add("I");
	    arr.add("am");
	    arr.add("a");
	    arr.add("Synchronized");
	    arr.add("ArrayList");
	    
	    Iterator itr = arr.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    Collection<Integer> c = new ArrayList<Integer>();
	    c.add(1);
	    c.add(2);
	    System.out.println(c);
	    
	    List<String> lStr = List.of("ABC","XYZ");
	    System.out.println(lStr);
	    
	    LinkedList<String> i = new LinkedList<>();
//	    i.remove();
	   
	    
	    Vector<Integer> v = new Vector<Integer>();
	    int iV = 4;
	    v.add(iV);
	    
	    for (Integer integer : v) {
			System.out.println("Element is "+ integer);
		}
	    
	    
	    ArrayList<Integer> aim = new ArrayList<Integer>();
	    int iaim = 10;
	    aim.add(iaim);
	    
	    
	    String str1 = "ABCR";
	    System.out.println(str1.length());
	    
	    B b = null;
	    b.m1();
	    
	    b.m2();
	    
	    Stack<Integer> stc = new Stack<Integer>();
	    
	    Stack st = new Stack<>();
	    
	    Collection col = new ArrayList<>();
	}
}
