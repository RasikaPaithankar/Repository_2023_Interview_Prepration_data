package com.java.practice;

@FunctionalInterface
public interface Demo extends AInt {
	
// 	abstract method
//	public abstract void m1();

//	if child class does not provide implementation to default method, parent class method will be called.
// 	but implementation is provided in child interface, 	child interface method will called.
//	public default void m3() { System.out.println("Child - m3"); }
	
	
	public static void m4() { System.out.println("Child - m4"); }
}
