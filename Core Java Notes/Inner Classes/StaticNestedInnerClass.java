package com.java.practice;

/*
 	Static nested classes
 -	Sometimes we can declare inner classes with static modifier such type of inner 
	classes are called static nested classes.
 -	In the case of static nested class without existing outer class object there may 
	be a chance of existing static nested class object.
 -	static nested class object is not strongly associated with outer class object.
 	
 - 	Inside static nested classes we can declare static members including main() method also.
 -	Hence it is possible to invoke static nested class directly from the command prompt.
 
 - 	from static nested class we can access only static members of outer class.  	
*/

class A1 {
	int a = 1;
	static int b = 2;
	static class B1 {
		public void m1() {
			System.out.println("static nested class instance method");
// C.E:non-static variable a can not be referenced from a static			
//			System.out.println(a);
			System.out.println(b);
		}
		public static void m2() {
			System.out.println("static nested class static method");
		}
	}
}


public class StaticNestedInnerClass {

	public static void main(String[] args) {

	}

}


/*
  	Various possible combinations of nested class &interfaces
  	1. class inside a class
  	2. interface inside a class
  	3. interface inside a interface
  	4. class inside a interface
 
 
 1. class inside a class
 -	Without existing one type of object, if there is no chance of existing another type 
	of object, then we should go for class inside a class.
 -	e.g., Without existing University object, there is no chance of existing Department object.
 
 2. interface inside a class
 -	Inside class if we required multiple implements of an interface and these implementations of relevant 
 	to a particular class, then we should declare interface inside a class.
 
 3.	interface inside a interface
 -	Nested interfaces are always public,static whether we are declaring or not. 
 -	Hence we can implements inner interface directly with out implementing outer interface.
 -	Whenever we are implementing Outer interface , it is not required to implement Inner interfaces.
 -	i.e., Both Outer and Inner interfaces we can implement independently.
 
 4.	class inside a interface
 -	If a class functionality is closely associated with the use interface 
 	then it is highly recommended to declare class inside interface.
 -	We can also declare a class inside interface to provide default implementation for that interface.
 
   
Conclusions :

1. We can declare anything inside any thing with respect to classes and interfaces. 
2. Nesting interfaces are always public, static whether we are declaring or not.
3. class which is declared inside interface is always public,static whether we are declaring or not.
 
 */