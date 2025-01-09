package com.practice.encapsulation;

/* Binding of data and corresponding methods into a single unit is called Encapsulation */
public class Encapsulation {
	// e.g., of tightly encapsulated class.
	private int i;
		
	public int getI() {
		return i;
	}	

	public void setI(int i) {
		this.i = i;
	}
	
	void method() {
		System.out.println("Class is an example of encapsulation.");
	}

	
// 1. improves maintainability and modularity of the application	
// 2. provides flexibility to the user.
}

class Test {
	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
	}
}

//3. tightly encapsulated class
//- if class is said to be tightly encapsulated class if every variable is declare as private, 
//  whether it has getter or setter, and declared getter and setter method as public.
//  above class is tightly encapsulated.	

class Parent {
	// this class is not tightly encapsulated as it has protected variable.
	protected int i;
	private String s;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}	
}

// 4. if parent class is not tightly encapsulated then child class can not be tightly encapsulated.
//    even it has only private variables.

class Child extends Parent{
	private int j;
	
}

class Child2 extends Child{
	private int k;
}



