package com.java.practice;

/*
 * Abstraction - Hide implementation and ask child class to provide implementation for it.
 * 				 By using abstract classes and interfaces we can implement abstraction.
 * 
 * abstract method don't have implementation.
 * 
 * 1. if class is declare as abstract, in abstract class we might have non-abstract methods
 * 2. but if class has abstract method then class should be declare as abstract only.
 * 3. if child class extends abstract class then child class is responsible for implementation.
 * 	  if child don't provide implementation then it should declare as abstract only.
 *    then child of child is responsible for the implementation. 
 *    
 * 4.  Advantages -> 1. improves maintainability
 * 		  
*/

// 1. if class is declare as abstract, in abstract class we might have non-abstract methods.
public abstract class AbstractClass {
	void m1() {
		System.out.println("M1 method");
	}
	
	static void test() {
		System.out.println("Abstract class may contain static method.");
	}

}

// 2. but if class has abstract method then class should be declare as abstract only.
abstract class A{
	abstract void m2();
}

// 3. if child class extends abstract class then child class is responsible for implementation.
abstract class Parent {
	abstract void m3();
}

class Child extends Parent{

	@Override
	void m3() {
		System.out.println("Child class provide implementation to abstract method of parent class.");
	}
	
}