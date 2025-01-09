package com.java.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * if we extends RuntimeException, then we need not throws exception with method declaration.
 * but when we extends Exception class, then it treats as a checked Exception, so we have throws with method 
 * declaration.
 * 
 * recommended to extend RuntimeException class.
 * 
 * 1.7 Version Enhancement
 * 
 * 1. try with resources
 * 2. multi catch block
 *  
*/
class AException extends RuntimeException {
	public AException(String s) {
		super(s);
	}
}

class BException extends Exception {
	public BException(String s) {
		super(s);
	}
}


public class CustomizedException {

	public static void main(String[] args) throws BException {
		String s = "A";
		if (s.equalsIgnoreCase("A")) {
			throw new AException("A Exception is throwing");
		} else if(s.equalsIgnoreCase("B")) {
			throw new BException("A Exception is throwing");
		}
	}
}


//1.7 Version Enhancement

/*
 * 1. try with resources
 * 
 * a. We can declare any no of resources but all these resources should be separated with ;(semicolon)
 * b. All resources should be AutoCloseable resources. a resource said to be AutoCloseable if it implements 
 * 	  java.lang.AutoCloseable interface either directly or indirectly
 * c. Until 1.6 version try should be followed by either catch or finally 
 * 	  but 1.7 version we can take only try with resource without catch or finally.
 * 
 * 
 */

class tryWithResources {	
	public void m1() {
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))){
			
		} catch (IOException e) {
			
		}
	}
}

// 2. Multi catch block

/*
 * Until 1.6 version ,Even though Multiple Exceptions having same handling code 
 * we have to write a separate catch block for every exceptions, it increases
 * length of the code and reviews readability.
 * 
 * To overcome this problem Sun People introduced "Multi catch block" concept in 1.7 version.
 * 
 * 1. there should not be any relation between Exception types, otherwise we will get Compile time.
 * (either child to parent Or 
 * 		   parent to child Or 
 * 		   same type )
error)
 */

class A {
	public void m1() {
		try {
			
		} catch(ArithmeticException | NullPointerException e) {
			
		}
	}
}


// Exception Propagation

/*
 * With in a method if an exception raised and if that method doesn't handle that exception, 
 * then Exception object will be propagated to the caller 
 * then caller method is responsible to handle that exceptions. 
 * This process is called Exception Propagation.
 * 
 */


// Rethrowing an Exception

/*
 * To convert the one exception type to another exception type , 
 * we can use rethrowing exception concept.
 * 
 */

// e.g.,

class Test {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			throw new NullPointerException();
		}
	}
}

