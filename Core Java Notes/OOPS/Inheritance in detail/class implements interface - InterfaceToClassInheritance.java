package com.java.interview;


interface A {
	default void m1() {
		System.out.println("A Interface- m1");
	}
	
	void m2();
}

interface B {
	default void m1() {
		System.out.println("A Interface- m1");
	}
	
	void m3();
}

// m1 is method which present in both interfaces but while implementing 
// first compiler will throw an compiler exception 
// Error - "Duplicate default methods named m1 with the parameters () and () are inherited from the types B and A"
// we can implement m1 method but need to mentioned from which interface we are implementing m1 method.
// use "super" keyword to resolve ambiguity issue.

public class InterfaceToClassInheritance implements A,B{
	
	@Override
	public void m1() {
		A.super.m1();			
	}
	
	@Override
	public void m2() {
		System.out.println("M2");
	}
	
	@Override
	public void m3() {
		System.out.println("M3");
	}	
}

class main {
	public static void main(String[] args) {
		InterfaceToClassInheritance inheritance = new InterfaceToClassInheritance();
		inheritance.m1();
		inheritance.m2();
		inheritance.m3();
	}
}
