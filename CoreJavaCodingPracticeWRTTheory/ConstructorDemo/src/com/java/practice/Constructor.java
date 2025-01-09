package com.java.practice;

import java.io.IOException;

/*
 * 	Object creation is not enough.
 *  compulsory we should perform initialization.
 *  While creating object to perform initialization, constructor executes.
 *  
 *  Hence main objective of Constructor is initialization of an object.
*/
class Student {
	String sName;
	int rollNo;
		
// 1. Constructor name should be same as class name.
// 	  return type is not applicable to constructor.
// 	  applicable modifier to constructor are public, default, private, protected.
//	  static modifier is not allowed.	
// 	  If we are not writing at least one constructor then compiler will generate default constructor.
//	  If we are writing at least one constructor then compiler won't generate any default constructor.	
	
	// default constructor.
	public Student() {
		System.out.println("Constructor ");
	}
	
	
	// Parameterized Constructor
	public Student(String sName, int rollNo) {
		this.sName = sName;
		this.rollNo = rollNo;
	}

// 2.  if we provide return type then we won't get any compile time error and runtime error compiler.
//     simply compiler treats it as a method.
	void Student() {
		System.out.println("I am method");
	}

// 3. Before execution of constructor, Instance block executes for every object creation.
// 	  Instance block can not have arguments.
// 	  Constructor have arguments.
	
// 4. Other than initialization if we want to perform any activity for every object creation 
//    we have to define that activity inside instance block.	
	// Instance block
	int count =0;{
		count++;
		System.out.println("Instance block");
	}
	
	
// 5. static block
//		Static blocks will be executed at the time of class loading
//		we can have any number of static block but execution of static block is top to bottom.
		
	
	//static block
	static {
		System.out.println("Static block");
	}
	
	
//  We can take constructor in any java class including abstract class. 
//	but we can't take constructor inside interface.
	
// why abstract class has a constructor even when we can not create object of abstract class?
//	-> abstract class may contain instance variables 
//     when child class extends abstract class then those instance variables will available to child class
//	   and when we try to initialize child class object then need to initialize instance variable of abstract 
//     class as well.
// 	In short, to perform initialization of instance variables of abstract class at the time of initialization 
// 	of child class object, hence abstract class may contain constructor.	
		
}



public class Constructor {

	public static void main(String[] args) {
		Student student = new Student();		
	}

}



//*** super() Vs this() ***

// super() - calling super class constructor.
// this() - calling another constructor of same class.

// Inside constructor we can have super() or this();
// 1. super() or this() should be first line in the constructor, otherwise we will get compile time exception.
// 2. we can use either super() or this(), but not both simultaneously.
// 3. We can use super() (or) this() only inside constructor. If we are using anywhere else we will get compile time error. 



// e.g.,


class A {
	static int k = 1;
	
	public A(){
		System.out.println("super class A constructor called.");
	}
	
	
	public A(int i) {
		this(); 	// calling another constructor from same class.
		System.out.println("calling another constructor from same class");
	}
	
	public A (String s) {
		this(k);			// can not call instance variable , it should be static variable.
							// Cannot refer to an instance field k while explicitly invoking a constructor.
	}
}

class B extends A {
	public B() {
		super();			// calling super class constructor
		System.out.println("B constructor called");
	}
}

class C extends B{
	public C() {
		super();
		System.out.println("B constructor called");
	}
}


//*** super and this ***

// 1. super and this are keywords.
// 2. super - use to refer parent class instance members.
// 3. this -  use to refer current class instance members.
// 4. We can use anywhere (i.e., instance area) except static area , other wise we will get compile time error.


//*** 

//	if parent class do not have default constructor and has a parameterized constructor.
//	when child class extends parent class, and In child class trying to add default constructor 
//	then it will throw compile exception "Implicit super constructor D() is undefined."
//	it will ask to implement argument type constructor as Parent class constructor.
 

class D {
	public D(int i) {
		
	}
}

/*
 * class E extends D 
 * { 
 * 	public E() 		// throwing compile time error as mentioned above.
 * 	{
 *  	
 * 	}
 * }
 * 
 */

class F extends D {

	public F(int i) {
		super(i);		// no error.
	}
}


class G {
	public G() {
	}
	
	public G(int i) {
	}	
}

class H extends G {
	public H() {
		super();
	}
	
	public H(int i) {
		super(i);
	}
}


//*** Exception

// 1.	if Parent class constructor throwing a checked exception then child class constructor should throw same 
//		exception or Parent exception. 

// e.g., 1 same exception

class I {
	public I() throws IOException{
		// TODO Auto-generated constructor stub
	}
}

class J extends I {

	public J() throws IOException {
		super();
	}	
}

// valid case - child - Parent 
class K extends I {

	public K() throws Exception {
		super();
	}
}

/* Invalid case - Parent - child
 * 
 * class L { public L()throws Exception { } }
 * 
 * class M extends L 
 * {
 * 
 * 	public M() throws IOException 
 * 	{ 
 * 	  super(); 
 * 	}
 * 
 * }
 * 
 */


/*
 * We can not access instance variables from the static area.
 * but we can access static variables from the instance area (method)
 */