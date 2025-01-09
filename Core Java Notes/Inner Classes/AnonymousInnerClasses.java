package com.java.practice;

/*
  Anonymous inner classes:

  -	Sometimes we can declare inner class without name such type of inner classes 
	are called anonymous inner classes.
  -	Main objective of anonymous inner classes is "just for instant use".
  - There are 3 types of anonymous inner classes
  	1. Anonymous inner class that extends a class.
	2. Anonymous inner class that implements an interface.
	3. Anonymous inner class that defined inside method arguments
	
*/


// 1. Anonymous inner class that extends a class.
/*	
 	Inside Anonymous inner classes we can take or declare new methods 
 	but outside of anonymous inner classes we can't call these methods directly.
	because we are depending on parent reference.
	
	e.g., m1(), m2()
	
	parent reference can be used to hold child class object 
	but by using that reference we can't call child specific methods.
*/

class PopCorn {
	public void taste () {
		System.out.println("Spicy");
	}
}

// 2. Anonymous Inner Class that implements an interface

class Test {
	public static void main(String args[]) {
		Runnable runnable = new Runnable() 
		{
			
			@Override
			public void run() {
				for(int i = 1; i<=10;i++) {
					System.out.println("Anonymous Inner Class that implements an interface "+ i);
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		for(int j=1;j<=5;j++) {
			System.out.println("main thread");
		}
	}
}

// 3. Anonymous Inner Class that define inside method arguments

class Test2{
	public static void main(String args[]) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<5;i++) {
					System.out.println();
				}
			}
		}).start();
		
		for(int j=1;j<=5;j++) {
			System.out.println("main thread");
		}
	}
}

public class AnonymousInnerClasses {

	public static void main(String[] args) {
		PopCorn popCorn = new PopCorn() 
		// anonymous inner class
		{	
			// We are overriding taste() method
			public void taste () {
				m1();
				System.out.println("Salty from anonymous inner class.");
			}
			public void m1() {
				System.out.println("I can only use inside anonymous class.");
			}
			
			public static void m2() {
				System.out.println("I am a static method.");
			}
		};
		
		popCorn.taste();
// can not call methods which declared in anonymous inner class on parent reference.
// parent reference can be used to hold child class object 
// but by using that reference we can't call child specific methods		
//		popCorn.m1();
//		popCorn.m2();
		PopCorn popCorn2 = new PopCorn();
		popCorn2.taste();
		
		
	}

}
