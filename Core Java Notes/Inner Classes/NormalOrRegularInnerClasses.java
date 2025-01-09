package com.java.practice;

/*Inner Classes 
 * 
 *	- Sometimes we can declare a class inside another class such type of classes are called inner classes.
 *	- Without existing one type of object if there is no chance of existing another type of object 
 *	  then we should go for inner classes.
 *	
 *	e.g., 
 *
 * 	Without existing Map object there is no chance of existing Entry object 
 * 	hence Entry interface is define inside Map interface.
 * 	Map is a collection of key-value pairs, each key-value pair is called an Entry.
 * 
 * 	Based on the purpose and position of declaration all inner classes are divided into 4 types.
	They are: 
		1. Normal or Regular inner classes
		2. Method Local inner classes
		3. Anonymous inner classes
		4. Static nested classes.
 * 
 */

//1. Normal or Regular classes
/*	
 -	If we are declaring a class inside another class directly without static modifier 
	such type of inner classes are called normal or regular inner classes.
 -	Inside inner class we can't declare static members.
 -	we can't invoke inner class directly from the command prompt.
 
 -	Can access inner class code from static area of outer class.
 - 	Can access inner class code from instance area of outer class.
 -	Can access inner class code from outside of outer class.
 
 - 	From inner class we can access all members of outer class directly.
 	(both static and nonstatic, private and non private methods and variables)
 	
 - 	the applicable modifiers for outer classes are
 	1. public 
 	2. default
 	3. final
 	4. abstract 
 	5. strictfp
 	
 - 	the applicable modifiers to inner classes are 
 	1. all of the above
 	2. private
 	3. protected
 	
 - Nesting Inner classes
	- We can declare an inner class inside another inner class.
*/

// 	Can access inner class code from static area of outer class.
// e.g.,
class OuterClass {
	
// - From inner class we can access all members of outer class directly.
	
	private int a = 1;
	int b = 2;
	static int c = 3;
	
	public void m1() {
		System.out.println("Outer class: m1");
	}
	
	private void m2() {
		System.out.println("Outer class: m2");
	}
	
	public static void m3() {
		System.out.println("Outer class: m3");
	}
	
	class InnerClass {
		int a = 5;
		public void m1() {
			int a = 10;
			System.out.println(a);					// it refers to local variable from same method.
			System.out.println(this.a);				// "this" refers current inner class object.
			System.out.println(OuterClass.this.a);	// To refer current outer class object 
													// we have to use "outer class name.this"
			System.out.println(b);
			System.out.println(c);
			m1();
			m2();
			m3();
			
		}
		
	}
	// accessing inner class from the static method from outer class.
	public static void main(String args[]) {
		OuterClass outerClass = new OuterClass();
		outerClass.new InnerClass();
	}
	
}

// 	Can access inner class code from instance area of outer class.
// e.g.,
class OuterClass1 {
	class InnerClass1 {
		public void m1() {
			System.out.println("Inner class accessing from instance area.");
		}
	}
	// accessing inner class from the instance area of Outer class.
	public void instanceAreaMethod() {
		InnerClass1 class1 = new InnerClass1();
		class1.m1();
	}
}

// Can access inner class code from outside of outer class.
class OuterClass2 {
	class InnerClass2{
		public void m2() {
			System.out.println("Inner class method accessing from outside of outer class NormalOrRegularInnerClasses");
		}
	}
}

//- Nesting Inner classes
class o1{
	class i1{
		//nested inner classes
		class i2{
			class i3{
				public void m1() {
					System.out.println("Test- Nested inner classes.");
				}
			}
		}
	}
}

public class NormalOrRegularInnerClasses {

	public static void main(String[] args) {
		// Accessing inner class method from the outside of outer class.
		new OuterClass2().new InnerClass2().m2();
		
		// calling nested inner classes
		new o1().new i1().new i2().new i3().m1();
	}
}
