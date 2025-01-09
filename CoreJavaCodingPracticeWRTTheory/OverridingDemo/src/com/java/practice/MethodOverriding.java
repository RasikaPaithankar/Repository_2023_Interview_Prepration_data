package com.java.practice;

import java.io.IOException;

/* 
 * Whatever available to Parent class is by default available to Child class through inheritance
 * if Child class is not satisfied with the Parent class method implementation then Child class is allowed to 
 * redefine the Parent class method in the Child class.
 * This process is known as "Method Overriding"
*/


// 1. In method overriding, Method resolution is decided by JVM depend on the runtime objects.

// 2. In method overriding, Method name and arguments should be same. i.e., signature should be same.

// 3. Until JAVA 1.4, return type should be same but after JAVA 1.5, co-variant return types are allowed.
// 	  if A class method return type is Parent then B class which extends class A, method return type can be 
// 	  Child.

public class MethodOverriding {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.method1();
		
		Child child = new Child();
		child.method1();
		
		Parent parent1 = new Child();
		parent1.method1();
			
		parent.method2();
		child.method2();
		
		parent.method3();
		
		parent.method4();
		child.method4();

		parent.finalMethod();
		child.finalMethod();
		parent1.finalMethod();
		
		parent.nonFinalMethod();
		child.nonFinalMethod();
		parent1.nonFinalMethod();
		
		Parent.method12();
		Child.method12();
		
		parent.method12();
		child.method12();
		parent1.method12();
		
	}
}

class Parent {
	int i = 10;
// overridden method 
	void method() {
		System.out.println("Parent method");	
	}
	
//	2. Method name and arguments should be same. i.e., signature should be same.
	void method1() {
		System.out.println("Parent method 1");	
	}
	
// 3. for non-primitive types - Until JAVA 1.4, return type should be same but after JAVA 1.5, co-variant return types are allowed.
//	  if A class method return type is Parent then B class which extends class A, method return type can be 
//	  Child.	
	NewParent method2() {
		NewParent parent = new NewParent();
		System.out.println("Parent Method 2");
		return parent;
	}
	
	NewChild method3() {
		NewChild child = new NewChild();
		System.out.println("Parent Method 3");
		return child;
	}
	
// 4. for primitive types - return type should be same.
	int method4() {
		System.out.println("Parent - method4 return int");
		return 10;
	}
	
// 5. for primitive types - if return type is different in child class then it throws an error.
// 	  error - "The return type is incompatible with Parent.method5()"	
	int method5() {
		System.out.println("Parent - method 5 return int");
		return 10;
	}
	
// 6. Private methods are not visible in the Child classes hence overriding concept is not applicable for 
// 	  private methods.
//    Based on own requirement we can declare the same Parent class private method in child class also. 
//    It is valid but not overriding.	
	 private void privateMethod() {
		 System.out.println("Private method");
	 }
	 
// 7. Parent class final methods we can't override in the Child class. 
	 final void finalMethod() {
		 System.out.println("Parent- final method");
	 }
	 
// 8. Parent class non final methods we can override as final in child class.
	 void nonFinalMethod() {
		 System.out.println("Parent - non-final method");
	 }
	 
// 9. While overriding we can't reduce the scope of access modifier
	 public void method6() {
		 System.out.println("Parent - public method 6 ");
	 }
	 
// 10. We can increase the scope of access modifier.
//	   private < default < protected < public 
//	   Parent - default -> Child - default / Child - protected / Child - public
//	   Parent - protected -> Child - protected / Child - public
//	   Parent - public -> Child - public	 
	 protected void method7() {
		 System.out.println("Parent - public method 7");
	 }
	 
// 11. For checked-exception - if Parent class throwing an exception, Child class method should throw same exception.
//	   or Parent class method is throwing Parent exception and Child class method will throw child exception.
//	   otherwise it will throw an error "Exception Exception is not compatible with throws clause in Parent.method8()"
	 public void method8() throws IOException {
		 System.out.println("Parent - Throws IOException");
	 }
	 
// Parent checked-Exception -> Child checked-Exception relation is valid.
	 public void method9() throws Exception {
		 System.out.println("Parent - Throws IOException");
	 }

	 
	 public void method10() throws ArrayIndexOutOfBoundsException{
		 System.out.println("Parent- Throws SQLExeption");
	 }
	 
// 12. there are no restrictions for un-checked exceptions.
// 	   i.e., if Parent method is not throwing exception, Child class method can throw un-checked exception.	 
	 public void method11(){
		 System.out.println("Parent - No Exception");
	 }
	 
	 public void method11_1() throws ClassNotFoundException{
		 System.out.println("method11_1");
	 }
	 
// 13. We can't override a static method as non static.
	 public static void method12() {
		 System.out.println("Parent-Static method");
	 }
	 

// 14. Similarly we can't override a non static method as static
//	   if we try to override it will throw an error "This static method cannot hide the instance method from Parent"	 	 
	 public void method13() {
		 System.out.println("Parent non-static method");
	 }
	 
// It seems to be overriding concept is applicable for static methods but it is not overriding it is method hiding.
// for static method overriding, Method resolution is always takes care by compiler based on reference type.	
	 
	 
// 15. A var-arg method should be overridden with var-arg method only. If we are trying to override with normal method then 
//     it will become overloading but not overriding.
	 public void method15(int...i) {
		 System.out.println("Parent var-arg method");
	 }
	 
// 16. Overriding concept is not applicable for variables
// 	   Variable resolution is always takes care by compiler based on reference type.

}

class Child extends Parent{
	int i = 10;
	
// 	overriding method
	void method() {
		System.out.println("Child method");
	}
	
// 2. Method name and arguments should be same. i.e., signature should be same.
	void method1() {
		System.out.println("Child method 1");	
	}
	
// 2. as method1 has argument in child class it is not treated as overriding method.
	void method1(int i) {
		System.out.println("Child method 1 , i "+ i + " is not overridding method.");
	}

// 3. Until JAVA 1.4, return type should be same but after JAVA 1.5, co-variant return types are allowed.
//	  if A class method return type is Parent then B class which extends class A, method return type can be 
//	  Child.
// 	  Here, Parent- method2 return NewParent but Child - method2 returns NewChild 
//	  allowed type is co-variant i.e., Parent-Child relation is allowed.
// 	  otherwise it will throw an error.	
	NewChild method2() {
		NewChild child = new NewChild();
		System.out.println("Child Method 2");
		return child;
	}
	
// 3. Child-Parent relation (reverse) is not allowed. only Parent-Child is allowed.
	
//	NewParent method3() {
//		NewParent parent = new NewParent();
//		System.out.println("Parent Method 2");
//		return parent;
//	}

// 4. for primitive types - return type should be same.
	int method4() {
		System.out.println("Child method4 - return int");
		return 10;
	}
	

//--------------------------------------------------------------------------------------------------------------------//	
// 5. for primitive types - if return type is different then it throws an error.	
// 	  error message - "The return type is incompatible with Parent.method5()"	
	
//	long method5() {
//		System.out.println("Child - method 5 return int");
//		return 10l;
//	}

	
	
//--------------------------------------------------------------------------------------------------------------------//	
// 6. Private methods are not visible in the Child classes hence overriding concept is not applicable for 
//	  private methods.
//    Based on own requirement we can declare the same Parent class private method in child class also. 
//    It is valid but not overriding.	
	 private void privateMethod() {
		 System.out.println("Private method");
	 }	

//--------------------------------------------------------------------------------------------------------------------//	 
// 7. Parent class final methods we can't override in the Child class. 
// 	  if we try to override the final method then it throws error.
// 	  error - "Cannot override the final method from Parent"
	 
//	 final void finalMethod() {
//		 System.out.println("Parent- final method");
//	 }

// 8. Parent class non final methods we can override as final in child class.
	 final void nonFinalMethod() {
		 System.out.println("Child - non-final method set to final");
	 }	 

//--------------------------------------------------------------------------------------------------------------------//	 
// 9. While overriding we can't reduce the scope of access modifier otherwise it throws error
//     error - "Cannot reduce the visibility of the inherited method from Parent"
	 
//	 protected void method6() {
//		 System.out.println("Child - public method");
//	 }
	
// 10. We can increase the scope of access modifier.
//	   private < default < protected < public 
// 	   Parent - default -> Child - default / Child - protected / Child - public
//	   Parent - protected -> Child - protected / Child - public
// 	   Parent - public -> Child - public
	 public void method7() {
		 System.out.println("Child - public method 7");
	 }
//--------------------------------------------------------------------------------------------------------------------	 
// 11. For checked-exception - if Parent class throwing an exception, Child class method should throw same exception.
//	   or Parent class method is throwing Parent exception and Child class method will throw child exception.
// 	   otherwise it will throw an error "Exception- Exception is not compatible with throws clause in Parent.method8()"
	 public void method8() throws IOException {
		 System.out.println("Child - Throws IOException");
	 }
	 
//    Parent checked-Exception -> Child checked-Exception relation is valid.	 
	 public void method9() throws IOException {
		 System.out.println("Child - Throws IOException");
	 }
	 
// 	  throwing an error - "Exception Exception is not compatible with throws clause in Parent.method10()"
	 
//	 public void method10() throws Exception {
//		 System.out.println("Child - Throws Exception");
//	 }  
	  
	   
// 12. there are no restrictions for un-checked exceptions.
//     i.e., even Parent method is not throwing exception, Child class method can throw un-checked exception. 
	 public void method11() throws NullPointerException{
		 System.out.println("Parent - Null Pointer Exception");
	 }

//	valid 
// 	parent method11_1 is throwing classNotFoundException but child is not throwing any exception as its un-checked exception.	 
	 public void method11_1(){
		 System.out.println("method11_1");
	 }
//--------------------------------------------------------------------------------------------------------------------	//
// * Overriding with respect to static:

// 13. We can't override a static method as non static.
// 	   if we try to override static method as a non-static method, it will throw an error.
// 	   error - "This instance method cannot override the static method from Parent"	 
	 
//	 public void method12() {
//		 System.out.println("Child-Static method");
//	 }	 
	 
//    We can override a static method as a static.	 
	 public static void method12() {
		 System.out.println("Child-Static method");
	 }
	 
// 14. Similarly we can't override a non static method as static
// 	   if we try to override it will throw an error "This static method cannot hide the instance method from Parent"	 
	 
//	 public static void method13() {
//		 System.out.println("Parent non-static method");
//	 }	 
	 
// It seems to be overriding concept is applicable for static methods but it is not overriding it is method hiding.
// for static method overriding, Method resolution is always takes care by compiler based on reference type.
	 
	 
//--------------------------------------------------------------------------------------------------------------------	//
// * Overriding with respect to var-arg: 
	 
// 15. A var-arg method should be overridden with var-arg method only. If we are trying to override with normal method then 
//   it will become overloading but not overriding.
	 // method overloading
	 public void method15(int i) {
		 System.out.println("Child no var-arg method, it is method overloading.");
	 }
	 // method overriding
	 public void method15(int...i) {
		 System.out.println("Child var-arg method");
	 }

//--------------------------------------------------------------------------------------------------------------------	//
// * Overriding with respect to variables:
	 
// 16. Overriding concept is not applicable for variables
//	   Variable resolution is always takes care by compiler based on reference type.

}

// 17. should override Parent class abstract methods in Child classes to provide implementation

// 18. We can override a non-abstract method as abstract. this approach is helpful to stop availability of Parent method implementation to 
//	   the next level child classes



class NewChild extends NewParent{
	
}

class NewParent{

}
