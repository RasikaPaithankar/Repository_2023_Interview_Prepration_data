package com.java.practice;

/* inheritance -> is-a relationship 
 * extends keyword is used to implement inheritance.
 * main advantage is reusability.
*/
class Parent {
	int i;
	public void m1() {
		System.out.println("Parent - m1");
	}
}

class Child extends Parent{
	int j;
	public void m2() {
		System.out.println("Child - m2");
	}
}

public class Inheritance {

	public static void main(String args []) {
// 1. Parent class can not access child class method but whatever available to Parent will available to child.		
		Parent parent = new Parent();
		Child  child = new Child();		
		Parent parent1 = new Child();
// 2. Parent object can not use reference of Child class.	
//		Child child1 = new Parent(); 
		
// 3. Child can access parent class data,
// 	  Hence on the child reference we can call both parent and child class methods.
		child.m1();
		child.m2();

// 4. Parent can not access child class data.
//	  But on the parent reference we can call only methods available in the parent class.		
		parent.m1();
//		parent.m2();			// throws an error
	
// 5. Child object can use reference of Parent class
//		e.g., Parent parent1 = new Child();		
// 	  By using that reference we can call only methods available in parent class
		parent1.m1();
		
// 	  But child specific methods we can't call.
//		parent1.m2()
		
// 6. Why Inheritance -> provide most common functionality in one class and extend that class.
// 					  to reduce repetitive line of codes.	
//    Most common required functionality is defined inside object class, hence object class is root of all classes.
		
// 7. Multiple Inheritance 
// 	  Java don't support Multiple Inheritance for Classes.
// 	  Any class can extend only one class at a time.
// 	  But Interface can extends number of interfaces so multiple inheritance is applicable to Interfaces.		
		
	}	
}

//8. Multilevel Inheritance

// If class A extends B and class B extends C
//	then its called multilevel inheritance.

class A {
	int a;
	
	void m1() {
		System.out.println("A-m1");
	}
}

class B extends A{
	void m2() {
		System.out.println("A-m2");
	}
}

class C extends B{
	void m3() {
		System.out.println("A-m3");
	}
}


class Test {
	public static void main() {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.m1();			
//		a.m2();			// a object can not access method m2 and m3 as it belongs to child class.
// 		a.m3();		

		b.m1();
		b.m2();
//		b.m3();			// b object can not access child specific method m3
		
		c.m1();
		c.m2();
		c.m3();
		
	}
}


// 9. cyclic Inheritance
// it is not allowed in the JAVA
// Error - "The hierarchy of the type D is inconsistent"
/*
 * class D extends E{
 * 
 * }
 * 
 * class E extends D{
 * 
 * }
 */
