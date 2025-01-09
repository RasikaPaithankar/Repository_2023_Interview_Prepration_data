package com.java.practice;

public class A {
	
// 1. same name but different forms
// 2. name of method must be same but parameters should vary for methods.

	void method1() {
		System.out.println("no arg");
	}
	
	void method1(long i) {
		System.out.println("Int agr "+ i);
	}
	
	void method2(Parent p) {
		System.out.println("Parent ");
	}
	
	void method3(String s) {
		System.out.println("String version");
	}
	
	void method3(StringBuffer st) {
		System.out.println("String Buffer verion");
	}
	
	void method4(String s) {
		System.out.println("String version");
	}
	
	void method4(Object o) {
		System.out.println("Object version");
	}
	
	
	void method5(int i) {
		System.out.println("non var-arg method");
	}
	
//	does not consider return type for method Overloading, hence treating as method5 as same above hence throwing an error.
//  error - "Duplicate method method5(int) in type A"
//	String method5(int i) {
//		
//	}
	
	void method5(int...i) {
		System.out.println(" var-arg method ");
	}
	
	public static void main(String[] args) {
		A a = new A();
		int i = 10;
// 3. Automatic promotion in overloading (primitive data types)
// 	  if compiler not able to find the method with exact match we wont get compile time error.
//	  1st compiler will promotes the argument type to next level and checks whether the method match is 
//    available or not. if not compiler will promote argument type to next level until it finds exact match.
//	  if no match found compiler will throw an error. 
		a.method1(i);
		
//	  match not found for method1 with float even after promotion of argument., it throws Compile time Exception.
//		float f = 20;
//		a.method1(f);
		
// 4. for non-primitive data types
//	  should have Parent-child relationship for arguments.
// 	  if method2 has Parent class argument, we can pass child class arguments only.
// 	  if we pass other than Parent-child relationship class then compiler will throw an error.		
		Child child = new Child();
		a.method2(child);
		
// 		String is not a child of Parent class hence throwing an error		
//		String s = "Test";
//		a.method2(s);
		
//	5. The method method3(String) is ambiguous for the type A
//	   String and StringBuffer both class extends Object class hence when we pass null it throw ambiguous error. 		
//		a.method3(new Object());
// 		a.method3(null);
		
		
		
// 	6. child class will get the more priority than parent class
//	   it will print "String version"		
		a.method4(null);
		
// 	7. In general var-arg method will get less priority 
// 	   if there is not match found then var-arg will execute.		
		a.method5();		// it will print "var-arg method".
		a.method5(10);		// it will print "non var-arg method".
		a.method5(10,10);	// it will print "var-arg method".


//	8. Method-overloading does not depend on the run time objects.
//	   method resolution is always based on reference type 
// 	   runtime object won't play any role in overloading		
		Test t = new Test();
		
		Animal animal = new Animal();
		t.method6(animal);
		
		Cat cat = new Cat();
		t.method6(cat);
		
		// Parent class object can not refer to child class reference.
		// Cat cat1 = new Animal();
		
		// here reference is animal class hence it will print "Animal".
		Animal animal1 = new Cat();
		t.method6(animal1);
	}
}

class Animal{}

class Cat extends Animal{}

class Test {
	void method6(Animal a) {
		System.out.println("Animal");
	} 
	
	void method6(Cat c) {
		System.out.println("Cat");
	}
}