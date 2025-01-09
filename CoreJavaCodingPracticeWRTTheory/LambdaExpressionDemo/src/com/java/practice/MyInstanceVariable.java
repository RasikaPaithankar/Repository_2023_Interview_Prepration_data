package com.java.practice;

public class MyInstanceVariable {
	int i;
	static String s1 = "String is"; 
	
	public void display() {
		TestInterface t1 = (s1) -> {
			System.out.println(s1 + " immutable");
		};
		
		t1.testLocalVariable(s1);
	}
	
	public void show() {
		AFunctionalInterface a1 = () -> {
			i =10;
			System.out.println(i);
		};	
		a1.m1();
	}
}
