package com.java.interview;

interface C {
	default void m1() {
		System.out.println("A-m1");
	}
	
	void m2();
}

interface D {
	default void m1() {
		System.out.println("A-m1");
	}
	
	void m3();
}

// m1 is method which present in both interfaces but while implementing 
// first compiler will throw an compiler exception 
// Error - "Duplicate default methods named m1 with the parameters () and () are inherited from the types C and D."
// we can implement m1 method but need to mentioned from which interface we are implementing m1 method.
// use "super" keyword to resolve ambiguity issue.
// for default method, if we are extends interfaces C and D then we have to provide implementation to default method.
// to resolve ambiguity issue.
public interface InterfaceToInterfaceInheritance extends C, D{

	@Override
	default void m1() {
		C.super.m1();
	}
}

interface R {
	default void love() {
		System.out.println("love");
	}
}

// As S is extending R and there is no multiple inheritance so no ambiguity  
// hence no need to provide implementation to any default method
// default method is by default available to child class through inheritance.
// hence on child class reference we can call parent class default method.
interface S extends R{
	
}


class Test {
	public static void main() {
		S s= new S() {
			
		};
		s.love();
	}
}
