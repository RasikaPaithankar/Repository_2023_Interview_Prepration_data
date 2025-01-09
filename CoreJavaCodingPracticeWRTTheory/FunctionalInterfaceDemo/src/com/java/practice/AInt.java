package com.java.practice;

@FunctionalInterface
public interface AInt {

//	 Can not have an abstract method as Parent interface "Demo" has an abstract method. 
//	 if we add an abstract method in child it will be no longer functional interface.
//	 it will throw an exception 
//	 but we can have any number of Default and Static method.
//	 we can override Default methods but we can not override Static method
	
	public abstract void m1();
	
	public default void m3() {System.out.println("Parent-m3");	}
	
	public static void m4() { System.out.println("Parent - m4"); }
}


