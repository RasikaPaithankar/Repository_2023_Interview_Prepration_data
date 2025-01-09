package com.java.practice;

/*	2. Method local inner classes
 
 -	Sometimes we can declare a class inside a method such type of inner classes are
	called method local inner classes.
 -	We can access method local inner class only within the method where we declared it.
 -	That is from outside of the method we can't access.
 -	As the scope of method local inner classes is very less.	
	
 - 	If we are declaring inner class inside instance method then
   	we can access both static and non static members of outer class directly.
 -	If we are declaring inner class inside static method then 
   	we can access only static members of outer class directly 
   	and we can not access instance members. 
   	
 -	From method local inner class we can't access local variables of the method in which we declared it.
 -	But if that local variable is declared as final then we won't get any compile time error.  	
	
 - 	The only applicable modifiers for method local inner classes are
 		1. final 
 		2. abstract
 		3. strictfp
	
*/

class outer1 {
	int a = 1;
	static int b = 2;
	public void m1() {
//		local variable should declared as final as using inside inner class method.
		final int x = 6;
		// instance method
		class inner1 {
			
			public void m2 () {
				System.out.println("I can print instance and static variables from outside of class as its instance method");
				System.out.println(a);
				System.out.println(b);
				System.out.println("Method local inner classes m2");
			}
			
		}
// can access method local inner class only within the method where we declared it		
		new inner1().m2();
	}
// can not access from outside of the method, will throw an C.E.	
//	new inner1().m2()
}

class outer2 {
	int c = 3;
	static int d = 4;
	public static void m1() {
		int y = 6;
//		local variable should declared as final	as using inside inner class method	
		final int e = 5;
		
		class inner2 {
			public static void m2() {
//		local variable should declared as final				
				final int f = 5;
				System.out.println("I can only access static variables from outer class as I am static method in inner class.");
				// give C.E for instance variable. 
				//System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
			}
		}
	}	
}

public class MethodLocalInnerClasses {

	public static void main(String[] args) {

	}

}
