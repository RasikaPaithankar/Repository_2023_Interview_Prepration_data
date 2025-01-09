package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import javax.swing.JButton;

public class LamdaExpression{

	public static void main(String[] args) {

		// without Lambda expression
		
		AFunctionalInterface Afl = new AFunctionalInterface() {
			
			@Override
			public void m1() {
				System.out.println("Its a lengthy code");
			}
		};
		
		Afl.m1();
		
		// Using Lambda Expression
		
		AFunctionalInterface fl = () -> 
		{
			System.out.println("Calling m1 method...");
		};
			
		fl.m1();
		
		// one Parameter Lambda expression
		// - parameter data type is not mentioned
		FuncInterface1 f1 = (i) -> {
			System.out.println("Print i " + i);
		};
		
		f1.m1(10);
		
		FuncInterface1 f2 = (int i) -> System.out.println("Data TYpe Print Value " + i);
	
		
		f2.m1(20);
		
		FuncInt2 f3 = (String fName, String lName) -> System.out.println("Hello " + fName + " " + lName);
		
		
		String fName = "Rasika";
		String lName = "Swpanil";

		f3.say(fName, lName);
		
		
		// Iterating Collections Using the Foreach Loop
		
		List<String> l = new ArrayList<String>();
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("F");
		
		l.forEach((element) -> {
			System.out.print(element + "  ");
		});
		
		System.out.println(" ");
		
		FunInt3 f4 = (a,b) -> {
			return (a+b);
		};
		
		System.out.println(f4.add(10, 20));
		
		Runnable r = () -> {
			System.out.println("New Thread is running");
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(2, "Kaju", "Biju"));
		personList.add(new Person(1, "Gaju", "Biju"));
		personList.add(new Person(0, "", "Biju"));
		
		Collections.sort(personList, (p1, p2) -> {
			return p1.fName.compareTo(p2.fName);
		});
		
		personList.forEach((person) -> {
			System.out.println("Person " + person);
		});
				
		Stream<Person> stP = personList.stream().filter((p) -> p.age >= 1);
		
		stP.forEach((person) -> {
			System.out.println(person);
		});
			
		JButton button = new JButton("Click Me!");
		 
		button.addActionListener(e -> System.out.println("Handled by Lambda listener"));
		
		MyComprator myComp = (i,j) -> i > j;
		boolean result = myComp.compare(10, 9);
		System.out.println(result);
		
		
		String str = "Hello";
		
		TestInterface tsf = (s) -> {
			System.out.println(str);
		};
		
		MyInstanceVariable m1 = new MyInstanceVariable();
		m1.show();
		m1.display();
	}
}
